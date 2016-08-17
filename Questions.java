package survey;

import java.util.ArrayList;
import java.util.List;

public class Questions {

	int quesId;
	String quesName;
	String quesType;
	String op;

	Questions() {

	}

	Questions(int questionId, String ques, String qType, String option) {
		quesId = questionId;
		quesName = ques;
		quesType = qType;
		op = option;
	}

	int getquesId() {
		return quesId;
	}

	String getQues() {
		return quesName;
	}

	String getQuesType() {
		return quesType;
	}

	String getQuesOption() {
		return op;
	}
/*
 * add questions to list
 */
	List<Questions> addQuestions(List<String> content) {
		Questions question[] = new Questions[content.size()];
		List<Questions> quesList = new ArrayList<Questions>();
		int id = 101;
		for (int j = 0; j < content.size(); j++) {
			String q1 = content.get(j);
			String[] quesText = q1.split(",");
			String[] qText = new String[3];
			qText[0] = quesText[0];
			qText[1] = quesText[1];
			if (quesText.length == 2) {
				qText[2] = " ";

			} else {
				qText[2] = quesText[2];
			}

			question[j] = new Questions(id, qText[0], qText[1], qText[2]);
			id++;
			quesList.add(question[j]);
		}
		return quesList;
	}
}
