package house;

import java.util.Scanner;

public class Room {

	int room_no;
	/*
	 * @param guestId-It is the id of guest that is allocate to particular room
	 */
	int guestId;

	public int getRoom_no() {
		return room_no;
	}

	public int getGuestId() {
		return guestId;
	}

	public void setGuestId(int guestId) {
		this.guestId = guestId;
	}

	public void setRoom_no(int room_no) {
		this.room_no = room_no;
	}

	Room[] registerRoom(int no) {
		Room r[] = new Room[no];
		int j = 1;
		int roomNo;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < no; i++) {
			r[i] = new Room();
			System.out.println("Enter room id for" + j + "room");
			j++;
			roomNo = sc.nextInt();
			r[i].setRoom_no(roomNo);
			r[i].setGuestId(0);
		}
		return r;
	}
}
