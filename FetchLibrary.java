package session9;

import java.sql.Connection;
import java.util.*;
import java.sql.*;

public class FetchLibrary {

	Connection con;
	DBconnection db = new DBconnection();

	void getConnection() {
		db.loadDriver();
		con = db.ConnectDriver();

	}
/*
 * This method return list of all books as their title name and title_id written by 
 * particular author
 */
	List getBookTitle(String author) {
		List<Title> title = new ArrayList<Title>();

		String query = "select titles.title_id,title_nm from titles INNER JOIN title_author on titles.title_id=title_author.title_id INNER JOIN authors on title_author.author_id=authors.author_id  where authors.author_nm=?";

		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, author);
			ResultSet res = ps.executeQuery();

			while (res.next()) {
				Title t = new Title();
				t.setTitleId(res.getString(1));
				t.setTitleName(res.getString(2));
				title.add(t);
			}
		} catch (SQLException e) {
			System.out.println("Error in establishing query");
		}
		return title;

	}
/*
 * It checks that book as bookName is issue in previously or not
 */
	Boolean isBookIssue(String bookName) {

		String query = "select count(*) from book_issue as bi INNER JOIN books as b  on bi.accession_no=b.accession_no INNER JOIN titles as t on b.title_id=t.title_id where t.title_nm=?";
		Boolean flag = false;
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, bookName);
			ResultSet res = ps.executeQuery();

			while (res.next()) {

				int count = res.getInt(1);
				if (count > 0) {
					flag = true;
				}

			}
			ps.close();
			res.close();
		} catch (SQLException e) {
			System.out.println("Error in query");
		}

		return flag;
	}
/*
 * It return the number of books that are not issue since last 1 year or not issue in past 
 */
	int bookDelete() {
		String query = "select b.accession_no from books as b LEFT JOIN book_issue as bi on b.accession_no=bi.accession_no where TIMESTAMPDIFF(YEAR, bi.issue_dt,CURRENT_TIMESTAMP)>=1 OR bi.issue_dt is NULL";
		List<Integer> book = new ArrayList<Integer>();
		/*
		 * list book add all the book that were to be deleted further
		 */
		try {
			PreparedStatement ps = con.prepareStatement(query);

			ResultSet res = ps.executeQuery();

			while (res.next()) {

				book.add(res.getInt(1));

			}
			ps.close();
			res.close();
		} catch (SQLException e) {
			System.out.println("Error in query");
		}
		String query1 = "delete from books where accession_no=?";
      /*
       * deleted all books one by one that are in list book
       */
		try {

			PreparedStatement ps1 = con.prepareStatement(query1);
			int j = 1;
			for (int i = 0; i < book.size(); i++) {

				ps1.setInt(j, book.get(i));
				ps1.executeUpdate();

			}
			ps1.close();
		} catch (SQLException e) {

		}
		return book.size();
	}
/*
 * It closes connection 
 */
	void closeConnection() {
		db.closeConnection();
	}
}
