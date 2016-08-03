package house;

import java.util.Scanner;

public class Guest {

	int guest_id;
	int age;

	public int getGuest_id() {
		return guest_id;
	}

	public void setGuest_id(int guest_id) {
		this.guest_id = guest_id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
/*
 * Register all the guests with their ages
 */
	Guest[] registerGuest(int no) {
		Guest g[] = new Guest[no];
		int j = 1;
		int guestId = 1;
		int age;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < no; i++) {
			g[i] = new Guest();

			g[i].setGuest_id(guestId);
			System.out.println("Enter guest age ");
			guestId++;
			age = sc.nextInt();
			g[i].setAge(age);
		}
		return g;
	}
}
