package house;

public class Allotment {

	/*
	 * @param r-It is object of room class that contains roomId and Guest id that will allocate 
	 * to particular room
	 */
	Room r[];
	Guest g[];

	void allotRoom(Room r[], Guest g[]) {
		this.r = r;
		this.g = g;
		for (int i = 0; i < g.length; i++) {
			/*
			 * Calculate hash function for allocating room
			 */
			Boolean b = calculateHash(g[i].getGuest_id());
			if (b == false) {
				System.out.println("Room can't be allocated ");
				break;
			}
		}
	}
    
	Boolean calculateHash(int guestid) {
		int flag = 0;
		int age = 0;
		for (int i = 0; i < g.length; i++) {
			if (g[i].getGuest_id() == guestid) {
				age = g[i].getAge();

			}
		}
		/*
		 * @param index-It is the index of roomNo
		 */
		int index = age % r.length;

		if (r[index].getGuestId() == 0) {
			flag = 1;
			r[index].setGuestId(guestid);

		} else {
			for (int i = 0; i < r.length; i++) {
				if (r[i].getGuestId() == 0) {
					flag = 1;

					r[i].setGuestId(guestid);
					break;
				}

			}
			if (flag == 0) {
				return false;
			}
		}
		return true;
	}
/*
 * It will display guest id with their allocated rooms
 */
	void displayAllotRoom() {
		for (int i = 0; i < g.length; i++) {
			int id = g[i].getGuest_id();
			for (int j = 0; j < r.length; j++) {
				if (r[j].getGuestId() == id) {
					System.out.println("Guest id no" + id + "age "+g[i].getAge()+" "
							+ "room allloted is  " + r[j].getRoom_no());
				}
			}
		}
	}
}
