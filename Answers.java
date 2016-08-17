package survey;

import java.util.ArrayList;
import java.util.List;

public class Answers {
	String answer1 = "";
	int ansId, quesId;
	List<Answers> totalanswer = new ArrayList<Answers>();

	Answers() {

	}

	Answers(int answerId, String ans, int questionId) {
		ansId = answerId;
		quesId = questionId;
		answer1 = ans;

	}
/*
 * Unique answer Id
 */
	int ansId() {
		return ansId;
	}

	int quesId() {
		return quesId;
	}

	String getAnswer() {

		return answer1;
	}
/*
 * It will return answers of particular question
 */
	String getAnswerByquesId(int quesId) {
		String answer = "";
		for (int i = 0; i < totalanswer.size(); i++) {
			if (totalanswer.get(i).quesId() == quesId) {
				answer = answer + totalanswer.get(i).getAnswer() + ",";
			}
		}
		return answer;
	}

	List<Answers> addAnswers(List<Questions> quesList, int user) {
		ReadInput read = new ReadInput();
		Validations validate = new Validations();
		CalculatePercentageRating percent = new CalculatePercentageRating();
		Answers answer[] = new Answers[user * quesList.size()];
		CalculatePercentageRating rating[] = new CalculatePercentageRating[user];
		String answer1 = "";
		String allAnswer = "";
		int ansid = 1;
		int k = 0;

		List<CalculatePercentageRating> singleAnswer = new ArrayList<CalculatePercentageRating>();
		for (int i = 0; i < user; i++) {
			for (int j = 0; j < quesList.size(); j++) {

				System.out.println(quesList.get(j).getQues());
				System.out.println(quesList.get(j).getQuesType());
				if (quesList.get(j).getQuesOption() != " ") {
					System.out.println(quesList.get(j).getQuesOption());
				}

				if (quesList.get(j).getQuesType().equals("Multi Select")) {
					System.out
							.println("Answers can be multiple but seperated by commas");
				}
				String ans = read.readAnswer();
/*
 * It will validates that answers are only from options
 */
				if (quesList.get(j).getQuesType()
						.equalsIgnoreCase("Single Select")) {

					answer1 = validate.validateSingle(ans, quesList.get(j)
							.getQuesOption());
					rating[i] = new CalculatePercentageRating(answer1, quesList
							.get(j).getQuesOption());
					singleAnswer.add(rating[i]);
					ans = answer1;

				} else if (quesList.get(j).getQuesType()
						.equalsIgnoreCase("Multi Select")) {
					answer1 = validate.validateMultiple(ans, quesList.get(j)
							.getQuesOption());
					ans = answer1;
				} else {

					ans = ans;
				}
				answer[k] = new Answers(ansid, ans, quesList.get(j).getquesId());
/*
 * Add answers to list
 */
				totalanswer.add(answer[k]);
				k++;
				ans = "";
				answer1 = "";
				ansid++;
			}

		}
		System.out.print("Overall rating percentage for single selct answers");
		percent.calculatePercent(singleAnswer);
		return totalanswer;
	}
}
