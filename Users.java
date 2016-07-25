package survey;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Users {

	Users() {
		System.out.print("Enter number of users");
	}

	int getUser() {

		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));

		int users = 0;

		try {

			String user = bufferedReader.readLine();
			users = Integer.parseInt(user);
			if (users <= 0) {
				System.out.print("Enter number of users greater than 0");
				getUser();
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return users;

	}

}
