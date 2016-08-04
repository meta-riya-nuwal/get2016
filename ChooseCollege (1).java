package clg;

import java.util.*;
/*
 * Student choose college from their choice
 */
public class ChooseCollege {

	int sid, clgid;
	/*
	 * @clgalot-It stores that college is occupy to student or not
	 */
	Boolean clgalot;
	ChooseCollege chose[];
	public Boolean getClgalot() {
		return clgalot;
	}

	public void setClgalot(Boolean clgalot) {
		this.clgalot = clgalot;
	}

	

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getClgid() {
		return clgid;
	}

	public void setClgid(int clgid) {
		this.clgid = clgid;
	}
/*
 * Students enter college of their choice
 */
	ChooseCollege[] studentChooseCollege(Student s[], College c[]) {
		int flag = 0;
		int clgid = 0;
		Scanner sc = new Scanner(System.in);
		chose = new ChooseCollege[s.length];
		for (int i = 0; i < s.length; i++) {
			chose[i] = new ChooseCollege();
			System.out.println(s[i].getName() + "Enter college of your choice");
			System.out.println("Colleges are:");
			for (int j = 0; j < c.length; j++) {
				System.out.println(c[j].getCollege_name());
			}
			String clg = sc.next();
			while (true) {
				for (int j = 0; j < c.length; j++) {
					if (clg.equals(c[j].college_name)) {
						clgid = c[j].getClgId();
						flag = 1;
						break;
					}
				}
				if (flag == 0) {
					System.out
							.println("College is not in the list please select from registred colleges");

					clg = sc.next();
				} else {
					break;
				}
			}
			chose[i].setSid(s[i].getsId());
			chose[i].setClgid(clgid);
			chose[i].setClgalot(false);
		}

		return chose;

	}

}
