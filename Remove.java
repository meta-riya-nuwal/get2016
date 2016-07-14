public class Remove {

	int[] removeDuplicate(int input[]) {
		int i = 0, count = 0, j;
		int output[] = new int[input.length]; 
		for (i = 0; i < input.length; i++) {
			if (input[i] != -1) {     
				output[count] = input[i];
				count++;
				for (j = i + 1; j < input.length; j++) {
					if (input[i] == input[j]) {
						input[j] = -1;         //Remove Duplicate
					}
				}

			}

		}
		int output1[] = new int[count];
		for (i = 0; i < count; i++) {
			output1[i] = output[i]; //output array after removal of duplication
		}
		return output1;
	}

}


