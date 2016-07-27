package social;

import java.io.*;
import java.util.*;

public class UpdateFile {

	File file;
	File file1;
	File file2;
	File file3;
	FileWriter fw;
	FileWriter fw1;
	FileWriter fw2;
	FileWriter fw3;
	BufferedWriter bw;
	BufferedWriter bw1;
	BufferedWriter bw2;
	BufferedWriter bw3;
	ReadFile rf = new ReadFile();

	UpdateFile() {

	}
/*
 * For new user update it's profile
 */
	void addFile(int user, Profile pf[]) {

		try {
			file = new File("D:/input.txt");
			fw = new FileWriter(file.getAbsoluteFile(), true);

		} catch (IOException e) {

		}

		bw = new BufferedWriter(fw);
		for (int i = 0; i < user; i++) {
			try {

				//
				bw.write(pf[i].getId() + " " + pf[i].getName() + " "
						+ pf[i].getAge() + " " + pf[i].getGender() + " "
						+ pf[i].getPlace());
				bw.newLine();
			}

			catch (IOException e) {

			}

		}
		try {
			bw.close();
		} catch (IOException e) {

		}
	}
/*
 * If user accept any request then put it into friend's file
 */
	void addPendingConnection(Connection c[]) {

		try {
			file1 = new File("D:/request.txt");
			fw1 = new FileWriter(file1.getAbsoluteFile(), true);
			bw1 = new BufferedWriter(fw1);
		} catch (IOException e) {

		}

		FileInputStream fileInputStream;
		BufferedReader bufferedReader;
		int flag = 0;
		try {

			fileInputStream = new FileInputStream(file1);
			bufferedReader = new BufferedReader(new InputStreamReader(
					fileInputStream));
			String s1 = "";

			while ((s1 = bufferedReader.readLine()) != null) {

				flag = 1;
			}

		} catch (Exception ex) {

			System.out.println("Error Occured: " + ex.getMessage());
		}
		/*
		 * if(c.length>=1 && flag==1) { try { bw1.newLine(); } catch(IOException
		 * e) {
		 * 
		 * } }
		 */
		for (int i = 0; i < c.length; i++) {
			try {

				bw1.write(c[i].getUserid() + " " + c[i].getRequestid());
				bw1.newLine();
			} catch (IOException e) {

			}
		}
		try {
			bw1.close();
		} catch (IOException e) {

		}
	}
/*
 * If user don't want to accept request delete it
 */
	void deleteRequest(int user, int request) {
		List<String> rq = rf.readRequests();
		file3 = new File("D:/request.txt");
		try {
			PrintWriter writer = new PrintWriter(file3);
			writer.print("");
			writer.close();
		} catch (IOException e) {

		}
		file3 = new File("D:/request.txt");
		try {
			fw3 = new FileWriter(file3.getAbsoluteFile(), true);
			bw3 = new BufferedWriter(fw3);
		} catch (IOException e) {

		}
		for (int i = 0; i < rq.size(); i++) {
			String s = rq.get(i);
			String s1[] = s.split(" ");
			if (Integer.parseInt(s1[0]) == user
					&& Integer.parseInt(s1[1]) == request) {

			} else {

				try {
					bw3.write(s);
					bw3.newLine();
				} catch (IOException e) {
					System.out.print("File not updated");
				}
			}
		}
		try {
			bw3.close();
		} catch (IOException e) {

		}
	}
/*
 * Update in file that user is friend to friend
 */
	void addFriend(int user, int friend) {
		int flag = 0;
		FileInputStream fileInputStream;
		BufferedReader bufferedReader;

		try {
			file2 = new File("D:/friend.txt");
			fw2 = new FileWriter(file2.getAbsoluteFile(), true);

			bw2 = new BufferedWriter(fw2);

			fileInputStream = new FileInputStream(file2);
			bufferedReader = new BufferedReader(new InputStreamReader(
					fileInputStream));
			String s1 = "";

			while ((s1 = bufferedReader.readLine()) != null) {

			}
			bw2.write(user + " " + friend + " ");
			bw2.newLine();

		} catch (Exception ex) {

			System.out.println("Error Occured: ");
		}

		try {
			bw2.close();
		} catch (IOException e) {

		}

	}
/*
 * Is person one is friend of other
 */
	Boolean isFriend(int one, int other) {
		Connection c[] = rf.friendContent();
		for (int i = 0; i < c.length; i++) {
			if (c[i].getUserid() == one && other == c[i].getFriendId()) {
				return true;
			}
			if (c[i].getUserid() == other && one == c[i].getFriendId()) {
				return true;
			}

		}
		return false;
	}
/*
 * display all friends of active user
 */
	void displayFriend(int active) {
		Connection c[] = rf.friendContent();
		for (int i = 0; i < c.length; i++) {
			if (c[i].getUserid() == active) {
				System.out.println("Friend is" + c[i].getFriendId());
			}
			if (c[i].getFriendId() == active) {
				System.out.println("Friend is" + c[i].getUserid());
			}
		}
	}
	/*
	 * Is already user send request 
	 */
	Boolean isExists(int user, int request) {
		Connection c[] = rf.getContentOfRequests();
		for (int i = 0; i < c.length; i++) {
			if (user == c[i].getUserid() && c[i].getRequestid() == request) {
				return true;
			}
		}
		return false;
	}

}
