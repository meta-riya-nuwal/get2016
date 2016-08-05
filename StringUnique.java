package session6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class StringUnique {

	LinkedHashMap<String, Integer> index = new LinkedHashMap<String, Integer>();

	void calculateUnique(String unique) {

		String in[] = unique.split(" ");
		String u = "";

		for (int i = 0; i < in.length; i++) {
			u = u + in[i];

		}

		int uniqueNumber;
		if (index.containsKey(unique)) {

			System.out.println("repeated string");
			uniqueNumber = index.get(unique);

		} else {

			uniqueNumber = countNonRepeatString(u);

			index.put(unique, uniqueNumber);

		}
		System.out.println("Unique charchter is" + uniqueNumber);
	}

	int countNonRepeatString(String in) {
		List<String> ch = new ArrayList<String>();
		for (int i = 0; i < in.length(); i++) {
			ch.add(Character.toString(in.charAt(i)));
		}
		Set<String> mySet = new HashSet<String>(ch);

		return mySet.size();
	}
}
