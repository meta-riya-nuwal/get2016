package clg;

public class Counsilling {
	Student s[];
	College c[];
	ChooseCollege chse[];
	Queue<Integer> queue = new Queue<Integer>();

	void allotColleges(Student s[], College c[], ChooseCollege chse[]) {
		this.s = s;
		this.c = c;
		this.chse = chse;
		sortRankStudent();
		setQueue();
		alotStudentClg();

	}
/*
 * sort student according to their rank
 */
	void sortRankStudent() {

		int temp = 0;
		String name = "";
		String clg = "";
		int sid = 0;
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length - 1; j++) {
				
				
				if (first > second) {
					temp = s[j].getRank();
					
					s[j].setRank(s[j + 1].getRank());
					
					s[j + 1].setRank(temp);

					name = s[j].getName();
					
					s[j].setName(s[j + 1].getName());
					
					s[j + 1].setName(name);

					sid = s[j].getsId();
					
					s[j].setsId(s[j + 1].getsId());
					
					s[j + 1].setsId(sid);

				}
			}

		}

	}
/*
 * rank of student should be enter in queue
 */
	void setQueue() {

		for (int i = 0; i < s.length; i++) {
			queue.enqueue(s[i].getRank());

		}

	}
/*
 * Allot student to college if available
 */
	void alotStudentClg() {
		String clg = "";
		int clgId = 0;
		int seats = 0;
		int flag = 0;
		for (int i = 0; i < s.length; i++) {
			flag = 0;
			int rank = queue.getFront();
			int sid = s[i].getsId();
			queue.dequeue();

			for (int j = 0; j < chse.length; j++) {
				if (chse[j].getSid() == sid) {
					clgId = chse[j].getClgid();
				}
			}

			for (int j = 0; j < c.length; j++) {
				if (c[j].getClgId() == clgId) {
					seats = c[j].getNo_of_seats();
					if (seats > 0) {

						flag = 1;
						c[j].setNo_of_seats(seats - 1);
						break;
					}
				}

			}

			if (flag == 1) {

				for (int j = 0; j < chse.length; j++) {
					if (chse[j].getSid() == sid) {

						chse[j].setClgalot(true);
					}
				}
			} else {

				for (int j = 0; j < chse.length; j++) {
					if (chse[j].getSid() == sid) {

						chse[j].setClgalot(false);
					}
				}
			}

		}
	}

	Student[] getStudentAfterSort() {
		return s;
	}

	ChooseCollege[] getCollegeAlot() {

		return chse;
	}
}
