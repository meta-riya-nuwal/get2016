package clg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {

	Student s[];
	String name;
	int rank, sId;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	Student[] registerStudent() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of students");
		int n = sc.nextInt();
		s = new Student[n];
		int j = 1;
		for (int i = 0; i < n; i++) {
			System.out.println("Student No." + j);
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
				} catch (NumberFormatException e) {
					System.out.println("Plz enter rank in numeric format");
					System.out.println("Enter rank of student");
					rnk = sc.next();
				}
			}
			s[i].setRank(rank);
			s[i].setsId(j);
			j++;

		}
		return s;
	}
}
