package survey;

import java.util.List;

public class CalculatePercentageRating {
	String answer = "";
	String option = "";

	public CalculatePercentageRating() {
		// TODO Auto-generated constructor stub
	}

	public CalculatePercentageRating(String ans, String op) {
		// TODO Auto-generated constructor stub
		answer = ans;
		option = op;
	}

	String getAnswer() {
		return answer;
	}

	String getOptions() {
		return option;
	}
/*
 * Calculate percentage of single select answers
 */
	void calculatePercent(List<CalculatePercentageRating> singleSelect) {

		String option = singleSelect.get(0).getOptions();
		int count = singleSelect.size();
		int c = 0;
		float per;
		String modifiedOptions = option.replace("(", "/").replace(")", "")
				.trim();
		String op[] = modifiedOptions.split("/");

		for (int i = 0; i < op.length; i++) {
			for (int j = 0; j < count; j++) {
				if (singleSelect.get(j).getAnswer().equals(op[i])) {
					c++;
				}
			}

			per = ((float) c / count) * 100;
			System.out.println(op[i] + " " + per);
			c = 0;
		}
	}

}
