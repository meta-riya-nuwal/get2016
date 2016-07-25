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
}
