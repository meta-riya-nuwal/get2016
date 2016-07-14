public class Merge {

	int[] join(int a[], int asize, int b[], int bsize, int c[]) {
		int k = 0, i, j;
		for (i = 0, j = 0; i < asize && j < bsize;) {
			if (a[i] <= b[j]) {                  //compare elemnts of array a and array b
				c[k] = a[i];
				i++;
				k++;
			} else {
				c[k] = b[j];
				j++;
				k++;
			}
		}
		int m = 0;
		if (i < asize) {                      //remaining elemnts in array a insert in merge array
			for (m = i; m < asize; m++) {
				c[k] = a[m];
				k++;
			}
		}
		if (j < bsize) {                      //remaining elemnts of array b 

			for (m = j; m < bsize; m++) {

				c[k] = b[m];
				k++;
			}
		}
		int join[] = new int[k];
		for (i = 0; i < k; i++) {
			join[i] = c[i]; 
		}
		return join;
	}

	
}


