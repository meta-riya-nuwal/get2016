import java.util.ArrayList;
import java.util.Collections;

class Questions implements Comparable<Questions> {

	String ques;

	Questions(String ques) {
		this.ques = ques;
	}

	public String getQues() {
		return this.ques;
	}
/*
 * it compares object of questions
 * 
 */
	@Override
	public int compareTo(Questions q) {
		int a = this.ques.compareTo(q.ques);
		return a;

	}
}

public class Sort_ques {

	public static void main(String args[]) {
		Sort_ques q = new Sort_ques();

		ArrayList<Questions> ques = new ArrayList<Questions>();
		Questions ques1 = new Questions("Overall Rating");
		Questions ques2 = new Questions("Area Of improvement");
		Questions ques3 = new Questions("Feedback");
		ques.add(ques1);
		ques.add(ques2);
		ques.add(ques3);
		/*
		 * It directly call compareTo method for sorting
		 */
		Collections.sort(ques);

		for (Questions qu : ques) {
			System.out.println(qu.getQues());
		}

	}
}
