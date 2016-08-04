package clg;

public class CollegeCounsilling {

	public static void main(String args[]) {

		Student s = new Student();
		College c = new College();
		Status st = new Status();
		ChooseCollege chose = new ChooseCollege();
		Student student[] = s.registerStudent();
		Counsilling cnsl = new Counsilling();
		College clg[] = c.registerCollege();
		/*
		 * Student can choose their college of choice
		 */
		ChooseCollege chse[] = chose.studentChooseCollege(student, clg);
		/*
		 * students ranks are sorting here
		 */
		cnsl.allotColleges(student, clg, chse);
		student = cnsl.getStudentAfterSort();
		/*
		 * Now colleges are alloted to students if seats is available
		 */
		chse = cnsl.getCollegeAlot();
		/*
		 * status is check that clg is allot or not
		 */
		st.checkStatus(student, clg, chse);
	}

}
