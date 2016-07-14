public class Longest {

	int[] longestSequence(int input[]) {
		int i, max1 = 0, start = 0, count = 0, k = 0;
		int d[] = new int[2];

		for (i = 0; i < input.length - 1;) {

			d = max(i, input);        
			count = d[0];
			if (max1 < count) {      //compare length of sequence
				max1 = count;
				start = d[1];
			}
			if (count == 1)
				i = i + 1;
			else
				i = count + d[1];

		}

		int output[] = new int[max1];
		for (i = start; i < count + start; i++) {
			output[k] = input[i];
			k++;
		}
		return output;
	}

	int[] max(int j, int input1[]) {
		int count = 1;
		int e[] = new int[2];

		for (int i = j; i < input1.length - 1; i++) {
			if (input1[i] < input1[i + 1]) {      //compare that elemnts in increasing order
				++count;
			} else {

				e[0] = count;
				e[1] = j;
				return e;
			}
		}

		e[0] = count;   
		e[1] = j;

		return e;  //return length of increasing sequence and start location
	}

	

}


