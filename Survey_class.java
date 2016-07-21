import java.io.File;
import java.io.*;
import java.util.*;


/*
 * Calculate rating for single select question
 */
class Rating_per {
	void rate(String val[][]) {
		float per;
		int l = 1, k = 0;
		/*
		 * val array contain user answers for single select type questions
		 */
		String s[] = { "1", "2", "3", "4", "5" };
		int count = 0;
		int p = 0;

		for (int i = 0; i < val.length; i++) {
			p = 0;
			System.out.println("Rating per for" + l++ + "Select Question");
			for (int j = 0; j < s.length; j++) {
				for (k = 0; k < val[0].length; k++) {
					if (val[i][k].equals(s[j])) {

						++count;

					}
				}
				
				per = ((float)count / val[0].length) * 100;
				count = 0;

				System.out.println(++p + "  " + per);
			}
		}

	}
}

/*
 * It returns how many questions are of single select type
 */
class count_Single {
	int counts(String q[][]) {
		int count = 0;
		for (int i = 0; i < q.length; i++) {
			for (int j = 0; j < 3; j++) {
				if (q[i][j].equals("Single Select")) {
					count++;
				}
			}
		}
		return count;
	}
}

/*
 * It prints output of file to console
 */
class Print_Output {
	void print() {
		File file = new File("D:/output.txt");

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = br.readLine()) != null) {

				System.out.println(line);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
/*
 * it validates that for single select and multiple select options are only those are given
 */
class Validation {
	Boolean valid(String ans, String ques) {

		StringTokenizer slash;

		if (ques.equals(" ")) {
			return true;
		}
		if (ques.charAt(0) == '/') {
			slash = new StringTokenizer(ques, "/");

			while (slash.hasMoreTokens()) {
				if ((slash.nextToken()).equals(ans)) {

					return true;
				}
			}

		} else {
			return true;
		}

		return false;
	}
}
/*
 * It writes user responses to output file and store single select_select type answers to array
 */
class Question

{

	String single_select[][];

	String[][] display_Ques(String ques[][], int user, int count)
			throws IOException {

		Validation v = new Validation();
		count_Single cs = new count_Single();
		int no = cs.counts(ques);

		single_select = new String[no][user];
		File file = new File("D:/output.txt");

		// if file doesnt exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}

		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);

		String question = "";
		int p = 0, p_no = 0, ka = 0;
		int as = 0;
		int COUNTS = 0;
		String option = "";
		String ans = "";
		Scanner sc = new Scanner(System.in);
		StringTokenizer slash = null;
		System.out.println("Enter answers");
		int ct = 0;
		for (int c = 0; c < user; c++) {
			p = 0;
			ka = 0;
			bw.write("Participant" + " " + ++p_no + " ");
			System.out.println("UserNo." + p_no);
			for (int q = 0; q < count; q++) {
				System.out.print("Q" + ++p + " ");
				for (int k = 0; k < 3; k++) {

					if (ques[q][k].contains("/")) {
						ques[q][k] = ques[q][k].replace('(', '/');
						ques[q][k] = ques[q][k].replace(')', '/');
						slash = new StringTokenizer(ques[q][k], "/");
						System.out.println("Options are:");
						while (slash.hasMoreTokens()) {
							ct++;

							System.out.println(slash.nextToken());
						}
						as = ct;
						ct = 0;
					} else {
						System.out.print(ques[q][k]);
						System.out.println();

					}
					option = ques[q][1];

					question = ques[q][k];

				}

				ans = sc.nextLine();
/*
 * validation are called here
 */
				Boolean b = v.valid(ans, question);

				question = "";
				/*
				 * if answer are not in the option then again that question prints
				 */
				if (b == false) {
					System.out.print("Answer choose only from option");
					q = q - 1;
					p = p - 1;
				} else {
					/*
					 * for multiple select question we can ask that user want more answers
					 */

					if (option.equals("Multi Select") && COUNTS < as) {
						System.out
								.print("You want to enter more option press yes or No");
						String more = sc.nextLine();
						if (more.equals("yes")) {
							q = q - 1;
							p = p - 1;
						}
					}
					/*
					 * store single select answers
					 */
					if (option.equals("Single Select") && ka < no) {

						single_select[ka++][c] = ans;
					}

					bw.write(ans + " ");
				}
				COUNTS++;

				System.out.println();

			}
			COUNTS = 0;
			bw.newLine();
		}
		bw.close();

		
		return single_select;
	}

}
/*
 * return no of users
 */
class User {
	int getUser() {
		System.out.print("Enter no of users");
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		return user;
	}
}
/*
 * read the contents of file and put it into array of string
 */
class File_read
{
	String[][] readFile()
	{File file = new File("D:/input.txt");
	int count = 0;
	String input[] = new String[200];
	try (BufferedReader br = new BufferedReader(new FileReader(file))) {
		String line;
		while ((line = br.readLine()) != null) {
			input[count] = line;
			// System.out.println(input[count]);
			count++;
			
		}
	} catch (IOException e) {
		e.printStackTrace();
	}

	String comma = ",";

	/*
	 * given string will be split by the argument delimiter provided.
	 */

	String[][] ques = new String[count][3];

	for (int j = 0; j < count; j++) {
		String[] temp = input[j].split(comma);
		String temp1[] = new String[3];
		if (temp.length == 2) {
			temp1[0] = temp[0];
			temp1[1] = temp[1];
			temp1[2] = " ";

		} else {
			temp1 = temp;
		}
		for (int k = 0; k < 3; k++) {
			ques[j][k] = temp1[k];

		}

	}
	
	return ques;	
	}
}
/*
 * main class that handle all classes and print report and ratings
 */

public class Survey_class {

	public static void main(String args[]) {

		
		int p = 0;
		String ans = "";
		Scanner sc = new Scanner(System.in);
		User u = new User();
		int user_no = u.getUser();
		File_read f=new File_read();
		String ques[][]=f.readFile();
		Question qu = new Question();
		int count=ques.length;
		String rate1[][];
		try {
			rate1 = qu.display_Ques(ques, user_no, count);
			System.out.println("Output Report");
			Print_Output pa = new Print_Output();
			pa.print();
			System.out.println("Output Report for rating");
			System.out.println();
			Rating_per r = new Rating_per();
			r.rate(rate1);
		}

		catch (IOException e) {

		}

	}
}
