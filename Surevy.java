package survey;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.LinkedList;
import java.util.*;

public class Survey {

	public static void main(String args[]) {

		
		FileOperations file = new FileOperations();
		Validations v = new Validations();
		Questions question = new Questions();
		ReadInput readinput=new ReadInput();
		CalculatePercentageRating rating = new CalculatePercentageRating();
		List<String> content = new ArrayList<String>();
		Answers answers = new Answers();
		content = file.readDataOfFile();

		List<Questions> quesList = question.addQuestions(content);

		int user = readinput.getNumberOfUser();

		List<Answers> ansList = answers.addAnswers(quesList, user);

		file.answerToOutputFile(ansList, quesList.size(), user);
		System.out.println("Enter questionId for which you answer want");
		Scanner sc = new Scanner(System.in);
		int quesno = sc.nextInt();
		System.out.println("Answer is:-");
		System.out.println(answers.getAnswerByquesId(quesno));

	}
}
