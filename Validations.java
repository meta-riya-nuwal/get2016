package survey;

public class Validations {
	String validateSingle(String ans, String option) {
		ReadInput read = new ReadInput();
		int f = 0;
		String answer = "";
		String modifiedOptions = option.replace("(", "/").replace(")", "")
				.trim();
		String op[] = modifiedOptions.split("/");

		for (int i = 0; i < op.length; i++) {
			if (ans.equals(op[i])) {

				f = 1;
				return ans;

			}
		}
		if (f == 0) {
			System.out.print("Answer should be choose only from options");

			answer = read.readAnswer();
			validateSingle(answer, option);
		}

		return answer;
	}

	String validateMultiple(String ans, String option) {
		int count = 0;
		ReadInput r = new ReadInput();
		int f = 0;
		String answer = "";
		String modifiedOptions = option.replace("(", "/").replace(")", "")
				.trim();
		String op[] = modifiedOptions.split("/");
		String ansMultiple[] = ans.split(",");

		for (int j = 0; j < ansMultiple.length; j++) {
			for (int i = 0; i < op.length; i++) {

				if (ansMultiple[j].equals(op[i])) {
					count++;

				}
			}
		}
		if (count != ansMultiple.length) {
			System.out.print("Answer should be choose only from options");

			answer = r.readAnswer();
			validateMultiple(answer, option);
		} else {
			return ans;
		}

		return answer;
	}

}
