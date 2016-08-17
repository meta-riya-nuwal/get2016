package survey;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadInput {

	String ans = "";

	String readAnswer() {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));

		int users = 0;

		try {

			ans = bufferedReader.readLine();

		} catch (Exception e) {
			e.printStackTrace();

		}
		return ans;
	}
	int getNumberOfUser() {

		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));

		int users = 0;

		try {

			String user = bufferedReader.readLine();
			users = Integer.parseInt(user);
			if (users <= 0) {
				System.out.print("Enter number of users greater than 0");
				getNumberOfUser();
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return users;

	}
}
