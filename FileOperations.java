package survey;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.ArrayList;

public class FileOperations {
	FileOutputStream out;
	PrintWriter printWriter;
/*
 * Read questions from file
 */
	List<String> readDataOfFile() {
		List<String> data = new ArrayList<String>();
		FileInputStream fileInputStream;
		BufferedReader bufferedReader;

		try {
			File f = new File("D:/input.txt");
			fileInputStream = new FileInputStream(f);
			bufferedReader = new BufferedReader(new InputStreamReader(
					fileInputStream));
			String s1 = "";

			while ((s1 = bufferedReader.readLine()) != null) {

				data.add(s1);

			}

		} catch (Exception ex) {

			System.out.println("Error Occured: " + ex.getMessage());
		}

		return data;
	}
/*
 * It will save answers in output file
 */
	void answerToOutputFile(List<Answers> answer, int ques, int user) {

		try {
			File f = new File("D:/output.txt");
			printWriter = new PrintWriter(f);
			int q = 0;
			int u = 1;
			for (int i = 0; i < answer.size(); i++) {

				if (q >= ques) {
					q = 0;
					u++;
				}
				printWriter.println("Participant" + (u) + " "
						+ answer.get(i).ansId() + " " + answer.get(i).quesId()
						+ " " + answer.get(i).getAnswer());
				q++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		printWriter.close();

	}
}
