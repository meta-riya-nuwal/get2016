package clg;

public class Status {
/*
 * it return that to particular student which clg is alloted
 */
	void checkStatus(Student s[], College[] clg, ChooseCollege[] chse) {
		int sid = 0;
		int clgid = 0;
		String sname = "";
		String clgname = "";
		int rank = 0;
		for (int i = 0; i < chse.length; i++) {
			sid = chse[i].getSid();
			clgid = chse[i].getClgid();
			for (int j = 0; j < s.length; j++) {
				if (s[j].getsId() == sid) {
					sname = s[j].getName();
					rank = s[j].getRank();
				}
			}
			if (chse[i].getClgalot() == false) {
				System.out.println(sname + "didn't get any college");
			} else {
				for (int j = 0; j < clg.length; j++) {
					if (clg[j].getClgId() == clgid) {
						clgname = clg[j].getCollege_name();
						System.out.println(sname + "get " + clgname);
					}
				}
			}
		}
	}
}
