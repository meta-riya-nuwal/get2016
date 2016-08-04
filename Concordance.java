package data_struct;

import java.util.*;

public class Concordance {
/*
 * HashMap should be maintain that will contain character and their position in string
 */
	void calculateConcordance(String in) {
		LinkedHashMap<String, List<Integer>> index = new LinkedHashMap<String, List<Integer>>();
		int number = countNonRepeatString(in);

		for (int i = 0; i < in.length(); i++) {

			String ch = Character.toString(in.charAt(i));

			if (index.containsKey(Character.toString(in.charAt(i)))) {

				List l = index.get(Character.toString(in.charAt(i)));

				l.add(i);

				index.put(ch, l);
			} else {

				List<Integer> l = new ArrayList<Integer>();
				l.add(i);
				index.put(ch, l);

			}

		}
		System.out.println(index);
	}
/*
 * It will count non repeating character in string
 */
	int countNonRepeatString(String in) {
		List<String> ch = new ArrayList<String>();
		for (int i = 0; i < in.length(); i++) {
			ch.add(Character.toString(in.charAt(i)));
		}
		Set<String> mySet = new HashSet<String>(ch);

		return mySet.size();
	}

	public static void main(String args[]) {
		Concordance c = new Concordance();

		System.out.println("Enter string");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		String in[] = input.split(" ");
		System.out.println(in.length);
		input = "";
		for (int i = 0; i < in.length; i++) {
			input = input + in[i];

		}

		c.calculateConcordance(input);
	}
}
