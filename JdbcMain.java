package session9;

import java.util.*;
public class JdbcMain {

	public static void main(String args[])
	{
	FetchLibrary fetch=new FetchLibrary();
	DBconnection con=new DBconnection();
	/*
	 * Connection established 
	 */
	fetch.getConnection();
	System.out.println("Enter author name");
	Scanner sc=new Scanner(System.in);
	String author=sc.next();
	
	@SuppressWarnings("unchecked")
	List<Title> title=fetch.getBookTitle(author);
	System.out.println("-----Title_id and Title_name written by author"+author+"------");
	for(int i=0;i<title.size();i++)
	{
	Title t=new Title();
	t=title.get(i);
	System.out.println(t.getTitleId()+" "+t.getTitleName());
	}
	System.out.println("Enter book name to check that this book is issue or not");

	String book=sc.next();
	Boolean f=fetch.isBookIssue(book);
	if(f==true)
	{
		System.out.println("Book issued");
	}
	else
	{
		System.out.println("No book is issued");
	}
	
	System.out.println(fetch.bookDelete()+"book deleted");
	System.out.println("that are not issue since 1 year or not issue still");
	fetch.closeConnection();
	}
}
