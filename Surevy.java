package survey;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.LinkedList;

public class Survey {

	public static void main(String args[]) {

		ReadInput r = new ReadInput();
		Users u = new Users();
		FileOperations f = new FileOperations();
		Validations v = new Validations();
		List<String> content = new ArrayList<String>();
		/*
		 * read content from file
		 */
		content = f.readDataFile();
	
		int user = u.getUser();
		Questions question[] = new Questions[content.size()];
		Answers answers[] = new Answers[user];
		CalculatePercentageRating rat = new CalculatePercentageRating();
		CalculatePercentageRating rating[] = new CalculatePercentageRating[user];
		String answer = "";
		List<Questions> q = new ArrayList<Questions>();
		List<Answers> totalanswer = new ArrayList<Answers>();
		List<CalculatePercentageRating> singleAnswer = new ArrayList<CalculatePercentageRating>();
		String allAnswer = "";
		for (int i = 0; i < user; i++) {
			for (int j = 0; j < content.size(); j++) {
				String q1 = content.get(j);
				/*
				 * split each question seperated by commas
				 */
				String[] quesText = q1.split(",");
				String[] qText = new String[3];
				qText[0] = quesText[0];
				qText[1] = quesText[1];
				if (quesText.length == 2) {
					qText[2] = " ";

				} else {
					qText[2] = quesText[2];
				}
                
				question[j] = new Questions(qText[0], qText[1], qText[2]);
				/*
				 * add question in list
				 */
				q.add(question[j]);
                /*
                 * print questions for user
                 */
				System.out.println("Ques No." + (j + 1));
				System.out.println(q.get(j).getQues());
				System.out.println(q.get(j).getQuesType());
				if (q.get(j).getQuesOption() != " ") {
					System.out.println(q.get(j).getQuesOption());
				}
				q1 = "";
				if (q.get(j).getQuesType().equals("Multi Select")) {
					System.out
							.println("Answers can be multiple but seperated by commas");
				}
				String ans = r.readAnswer();
				/*
				 * for single select questions add answers to list
				 */
				if (q.get(j).getQuesType().equalsIgnoreCase("Single select")) {
					answer = v.validateSingle(ans, q.get(j).getQuesOption());
					rating[i] = new CalculatePercentageRating(answer, q.get(j)
							.getQuesOption());
					singleAnswer.add(rating[i]);
					allAnswer = allAnswer + answer + " ";

				} else if (q.get(j).getQuesType()
						.equalsIgnoreCase("Multi select")) {
					answer = v.validateMultiple(ans, q.get(j).getQuesOption());
					allAnswer = allAnswer + answer + " ";
				} else {

					allAnswer = allAnswer + ans + " ";
				}

			}
			answers[i] = new Answers(allAnswer);
			totalanswer.add(answers[i]);

			allAnswer = "";

		}
		f.answerToOutputFile(totalanswer);
		System.out.print("Overall rating percentage for single selct answers");
		rat.calculatePercent(singleAnswer);
	}
}
