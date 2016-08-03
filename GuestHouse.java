package house;

import java.util.*;

public class GuestHouse {

	public static void main(String args[]) {
		Room r = new Room();
		Guest g = new Guest();
		Allotment a = new Allotment();
		System.out.println("Enter no of rooms");
		Scanner sc = new Scanner(System.in);
		int roomNo = sc.nextInt();
		Room ro[] = r.registerRoom(roomNo);
		System.out.println("Enter no of guests");

		int noGuest = sc.nextInt();
		Guest guest[] = g.registerGuest(noGuest);
		a.allotRoom(ro, guest);
		a.displayAllotRoom();
	}
}
