package clg;

import java.util.InputMismatchException;
import java.util.Scanner;

class College {

	College co[];
	String college_name;
	int no_of_seats, clgId;

	public int getClgId() {
		return clgId;
	}

	public void setClgId(int clgId) {
		this.clgId = clgId;
	}

	public String getCollege_name() {
		return college_name;
	}

	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}

	public int getNo_of_seats() {
		return no_of_seats;
	}

	public void setNo_of_seats(int no_of_seats) {
		this.no_of_seats = no_of_seats;
	}
/*
 * register colleges with their name and number of seats
 */
	College[] registerCollege() {
		int j = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of colleges");
		int no_of_clg = sc.nextInt();
		co = new College[no_of_clg];
		int seat = 0;
		for (int i = 0; i < no_of_clg; i++) {
			System.out.println("College No." + j);
			co[i] = new College();
			System.out.println("Enter name of college");
			String name = sc.next();
			co[i].setCollege_name(name);
			System.out.println("Enter seats in college");
			String seats = sc.next();

			while (true) {
				try {
					seat = Integer.parseInt(seats);
					break;
				} catch (NumberFormatException e) {
					System.out.println("Plz enter rank in numeric format");
					System.out.println("Enter rank of student");
					seats = sc.next();
				}
			}

			co[i].setNo_of_seats(seat);
			co[i].setClgId(j);
			j++;
		}

		return co;

	}

}
