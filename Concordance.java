package data_struct;

import java.util.*;

public class Concordance {
/*
 * HashMap should be maintain that will contain character and their position in string
 */
	void calculateConcordance(String input) {
		LinkedHashMap<String, List<Integer>> index = new LinkedHashMap<String, List<Integer>>();
		for (int i = 0; i < input.length(); i++) {

			String ch = Character.toString(input.charAt(i));

			if (index.containsKey(Character.toString(input.charAt(i)))) {

				List<Integer> indexList = index.get(Character.toString(input.charAt(i)));

				indexList.add(i);

				index.put(ch, indexList);
			} else {

				List<Integer> indexList = new ArrayList<Integer>();
				indexList.add(i);
				index.put(ch, indexList);

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
		Concordance concordance = new Concordance();

		System.out.println("Enter string");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		String in[] = input.split(" ");
		System.out.println(in.length);
		input = "";
		for (int i = 0; i < in.length; i++) {
			input = input + in[i];

		}

		concordance.calculateConcordance(input);
	}
}
