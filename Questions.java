package survey;

public class Questions {

	String quesName;
	String quesType;
	String op;

	Questions(String ques, String qType, String option) {
		quesName = ques;
		quesType = qType;
		op = option;
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
}
