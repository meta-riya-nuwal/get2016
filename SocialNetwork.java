package social;

import java.util.*;
import java.io.*;

public class SocialNetwork {

	public static void main(String args[]) {
		ReadFile rf = new ReadFile();
		Profile pc = new Profile();
		Connection c1[];
		UpdateFile up = new UpdateFile();
		Scanner sc = new Scanner(System.in);
		String last = "", line = "";
		String id1 = "";
		System.out.println("Welcome to social networking site");
		System.out.println("how many new user want in your site");

		int user = sc.nextInt();
		String name, gender, place;
		int id, age;

		Profile p[] = new Profile[user];

		int j = 1;
		int flag = 0;
		try {
			File f = new File("D:/input.txt");
			BufferedReader input = new BufferedReader(new FileReader(f));

			while ((line = input.readLine()) != null) {
				last = line;
				flag = 1;
			}
		} catch (IOException e) {

		}

		String ID[] = last.split(" ");
		id1 = ID[0];

		if (flag == 1) {
			j = Integer.parseInt(id1);
			j = j + 1;
		}
		/*
		 * Update new user info to profile object
		 */
		for (int i = 0; i < user; i++) {
			p[i] = new Profile();
			id = j;
			p[i].setId(id);
			System.out.println("Enter name of user");
			name = sc.next();
			p[i].setName(name);
			System.out.println("Enter age of user");
			age = sc.nextInt();
			p[i].setAge(age);
			System.out.println("Enter gender of user");
			gender = sc.next();
			p[i].setGender(gender);
			System.out.println("Enter place of user");
			place = sc.next();
			p[i].setPlace(place);
			j++;
		}

		up.addFile(user, p);
		int active_user = 0;
		/*
		 * To prints available users
		 */
		System.out.println("Available users are:-");
		Profile po[] = rf.ContentToObject();
		for (int i = 0; i < po.length; i++) {
			System.out.println(po[i].getName());

		}
		System.out.println("You are active user Id Please:-");
		String active = sc.next();
		while (true) {

			try {
				active_user = Integer.parseInt(active);
				break;
			} catch (NumberFormatException e) {
				System.out
						.println("Id should be in integer form only plz enter again");
				active = sc.next();
			}
		}
		String ch4 = "Yes";
		int op = 0;
		while (ch4.equalsIgnoreCase("Yes")) {
			System.out.println("Choose option");
			System.out
					.println("Press 1 if Do You want to see info of user press yes or no");
			System.out
					.println("Press 2 for You want to send request to how many users:");
			System.out
					.println("Press 3 for Do You want to see your pending requests plz answer in yes or no");
			System.out
					.println("Press 4 for to check one person if friend to another");
			System.out
					.println("Press 5 to display all friends of active user ");

			String op1 = sc.next();

			while (true) {

				try {
					op = Integer.parseInt(op1);

					break;
				} catch (NumberFormatException e) {
					System.out
							.println("Id should be in integer form only plz enter again");
					op1 = sc.next();
				}
			}

			switch (op) {
			case 1:

				 System.out.print("Do You want to see info of user press yes or no");
				String ch1 = "";
				ch1 = sc.next();
				while (ch1.equals("yes")) {

					System.out.println("You want to see the info of user:-");
					String u = sc.next();
					Profile pf = pc.getProfile(u);
					System.out.println(pf.getId() + " " + pf.getName() + " "
							+ pf.getAge() + " " + pf.getGender() + " "
							+ pf.getPlace());
					System.out
							.print("Do You want to see info of user press yes or no");
					ch1 = sc.next();
				}
				break;
			case 2:
				System.out.println("You want to send request to how many users:-");
				int number = sc.nextInt();
				Connection c[] = new Connection[number];
				for (int i = 0; i < c.length; i++) {
					c[i] = new Connection();
					System.out
							.println("User id whom you want to send request:-");
					int request = sc.nextInt();
					while (true) {
						Boolean t = up.isExists(active_user, request);
						if (t == true) {
							System.out.println("Already request send");
							System.out
									.println("Renter User id whom you want to send request:-");
							request = sc.nextInt();
						} else {
							break;
						}
					}
					c[i].setRequestid(request);
					c[i].setUserid(active_user);
				}
				up.addPendingConnection(c);
				break;
			case 3:
				int fl = 0;
				 System.out.print("Do You want to see your pending requests plz answer in yes or no");
				String ch = sc.next();

				if (ch.equals("yes")) {
					c1 = rf.getContentOfRequests();

					for (int i = 0; i < c1.length; i++) {
						if (c1[i].getRequestid() == active_user) {

							System.out.println("Id No." + c1[i].getUserid()
									+ "sends you request");
							System.out
									.println("Do you want to accept it press yes or no");
							if (sc.next().equals("yes")) {
								Boolean b = up.isFriend(c1[i].getRequestid(),c1[i].getUserid());
								if(b==true)
								{
								System.out.println("Already friends they are");
								}
								else
								{
								up.addFriend(c1[i].getRequestid(),
										c1[i].getUserid());
								up.deleteRequest(c1[i].getUserid(),
										c1[i].getRequestid());
								}
							} else {
								up.deleteRequest(c1[i].getUserid(),
										c1[i].getRequestid());
							}
						}

					}
					if (fl == 0) {
						System.out.println("Now no pending request");

					}
				}
				break;
			case 4:
				System.out
						.println("Enter two persons id whom you want to check friend or not");
				int one = sc.nextInt();
				int other = sc.nextInt();
				Profile p1[] = rf.ContentToObject();
				int f1 = 0,
				f2 = 0;
				for (int i = 0; i < p1.length; i++) {
					if (one == p1[i].getId()) {
						f1 = 1;
					}
					if (other == p1[i].getId()) {
						f2 = 1;

					}
				}
				if (f1 == 0) {
					System.out.println(one + "is not register");
				}
				if (f2 == 0) {
					System.out.println(other + "is not register");

				}
				Boolean b = up.isFriend(one, other);
				if (b == true) {
					System.out.println(one + "is friend to" + other);
				} else {
					System.out.println(one + "is not friend to" + other);
				}

			case 5:
				up.displayFriend(active_user);

			}
			System.out.print("Do You want to another option Press yes or no");
			ch4 = sc.next();

		}

	}

}
