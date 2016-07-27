package social;

import java.io.*;
import java.util.*;

class ReadFile {

	FileOutputStream out;
	PrintWriter printWriter;
/*
 * Read content of profile written in input.txt
 */
	List<String> readContentOfProfile() {
		List<String> data = new ArrayList<String>();
		FileInputStream fileInputStream;
		BufferedReader bufferedReader;

		try {
			File f = new File("D:/input.txt");
			fileInputStream = new FileInputStream(f);
			bufferedReader = new BufferedReader(new InputStreamReader(
					fileInputStream));
			String s1 = "";

			while ((s1 = bufferedReader.readLine()) != null) {

				data.add(s1);

			}

		} catch (Exception ex) {

			System.out.println("Error Occured: " + ex.getMessage());
		}

		return data;
	}
	/*
	 *Content of profile set to its object
	 */

	Profile[] ContentToObject() {
		List<String> content = readContentOfProfile();
		Profile[] p = new Profile[content.size()];
		for (int j = 0; j < content.size(); j++) {
			p[j] = new Profile();
			String q1 = content.get(j);
			String[] pText = q1.split(" ");

			p[j].setId(Integer.parseInt(pText[0]));
			p[j].setName(pText[1]);
			p[j].setAge(Integer.parseInt(pText[2]));
			p[j].setGender(pText[3]);
			p[j].setPlace(pText[4]);

		}
		return p;
	}
	/*
	 * Read content of Requests written in request.txt
	 */
	List<String> readRequests() {
		List<String> data = new ArrayList<String>();
		FileInputStream fileInputStream;
		BufferedReader bufferedReader;

		try {
			File f = new File("D:/request.txt");
			fileInputStream = new FileInputStream(f);
			bufferedReader = new BufferedReader(new InputStreamReader(
					fileInputStream));
			String s1 = "";

			while ((s1 = bufferedReader.readLine()) != null) {

				data.add(s1);

			}

		} catch (Exception ex) {

			System.out.println("Error Occured: " + ex.getMessage());
		}

		return data;
	}
	/*
	 *Content of request Connection set to its object
	 */

	Connection[] getContentOfRequests() {
		List<String> content = readRequests();

		Connection[] c = new Connection[content.size()];
		for (int j = 0; j < content.size(); j++) {
			c[j] = new Connection();
			String q1 = content.get(j);
			String[] pText = q1.split(" ");

			c[j].setUserid(Integer.parseInt(pText[0]));
			c[j].setRequestid(Integer.parseInt(pText[1]));

		}
		return c;
	}
	/*
	 * Read content of friends written in friend.txt
	 */
	List<String> readFriendFile() {
		List<String> data = new ArrayList<String>();

		FileInputStream fileInputStream;
		BufferedReader bufferedReader;

		try {
			File f = new File("D:/friend.txt");
			fileInputStream = new FileInputStream(f);
			bufferedReader = new BufferedReader(new InputStreamReader(
					fileInputStream));
			String s1 = "";

			while ((s1 = bufferedReader.readLine()) != null) {

				data.add(s1);

			}

		} catch (Exception ex) {

			System.out.println("Error Occured: " + ex.getMessage());
		}

		return data;

	}
	/*
	 *Content of friends Connection set to its object
	 */
	Connection[] friendContent() {
		List<String> fr = readFriendFile();
		Connection[] c = new Connection[fr.size()];
		for (int j = 0; j < fr.size(); j++) {
			c[j] = new Connection();
			String q1 = fr.get(j);
			String[] pText = q1.split(" ");

			c[j].setUserid(Integer.parseInt(pText[0]));
			c[j].setFriendId(Integer.parseInt(pText[1]));

		}
		return c;
	}

	
}
