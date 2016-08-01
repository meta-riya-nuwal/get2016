package Single;

import java.util.*;

public class Counselling {

	int n;
	Student s[];
	College co[];
	int no_of_clg;
	Queue<Integer> queue = new Queue<Integer>();
/*
 * Student register for college of choice
 */
	void registerStudent() {
		int flag = 0;
		int rank;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of students");
		n = sc.nextInt();
		s = new Student[n];
		for (int i = 0; i < n; i++) {
			s[i] = new Student();
			System.out.println("Enter name of student");
			String name = sc.next();
			s[i].setName(name);
			System.out.println("Enter rank of student");
			String rnk = sc.next();
			while (true) {
				try {
					rank = Integer.parseInt(rnk);
					break;
				} catch (InputMismatchException e) {
					System.out.println("Plz enter rank in numeric format");
					System.out.println("Enter rank of student");
					rnk = sc.next();
				}
			}
			s[i].setRank(rank);
			System.out.println("Enter college name");
			String college = sc.next();
			while (true) {
				for (int j = 0; j < no_of_clg; j++) {
					if (college.equals(co[j].college_name)) {
						flag = 1;
						break;
					}
				}
				if (flag == 0) {
					System.out
							.println("College is not in the list please select from registred colleges");

					college = sc.next();
				} else {
					break;
				}
			}
			s[i].setCollege_choice(college);
		}
		for (int i = 0; i < n; i++) {

			System.out.println(s[i].getRank() + " " + s[i].getName() + " "
					+ s[i].getCollege_choice());
		}
	}
/*
 * College with their no of seats
 */
	void collegeSeats() {

		int seat;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of colleges");
		no_of_clg = sc.nextInt();
		co = new College[no_of_clg];
		for (int i = 0; i < no_of_clg; i++) {
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

		}

	}
/*
 * rank sorted according with thier rank
 */
	void sortRank() {
		int temp = 0;
		String name = "";
		String clg = "";
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				int first = s[j].getRank();
				int second = s[j + 1].getRank();
				String name1 = s[j].getName();
				String name2 = s[j + 1].getName();
				String clg1 = s[j].getCollege_choice();
				String clg2 = s[j + 1].getCollege_choice();

				if (first > second) {
					temp = first;
					first = second;
					s[j].setRank(second);
					second = temp;
					s[j + 1].setRank(temp);

					name = name1;
					name1 = name2;
					s[j].setName(name2);
					name2 = name;
					s[j + 1].setName(name);

					clg = clg1;

					clg1 = clg2;
					s[j].setCollege_choice(clg2);
					clg2 = clg;
					s[j + 1].setCollege_choice(clg);

				}
			}

		}

	}
/*
 * queue sorted with their rank
 */
	void setQueue() {

		for (int i = 0; i < n; i++) {
			queue.enqueue(s[i].getRank());

		}

	}
/*
 * college allot to student if seats is available
 */
	void allotColleges() {
		for (int i = 0; i < n; i++) {
			s[i].setCollege_alot(0);
		}
		for (int i = 0; i < n; i++) {
			int rank = queue.getFront();

			queue.dequeue();
			String clg = s[i].getCollege_choice();
			for (int j = 0; j < no_of_clg; j++) {
				if (clg.equals(co[j].getCollege_name())
						&& co[j].getNo_of_seats() > 0) {

					co[j].setNo_of_seats(co[j].getNo_of_seats() - 1);
					s[i].setCollege_alot(1);
				}

			}

		}
	}
/*
 * it check status that college is alloted to student or not
 */
	void checkStatus() {
		for (int i = 0; i < n; i++) {
			if (s[i].getCollege_alot() == 1) {
				System.out.println(s[i].getName() + " got college" + " "
						+ s[i].getCollege_choice());
			} else {
				System.out.println(s[i].getName()
						+ " didn't get college of his choice");

			}
		}
	}

	public static void main(String args[]) {
		Counselling c = new Counselling();

		c.collegeSeats();
		c.registerStudent();
		c.sortRank();

		c.setQueue();

		c.allotColleges();
		c.checkStatus();

	}
}
