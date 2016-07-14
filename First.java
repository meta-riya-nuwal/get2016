public class First {

	int convertBinaryToOctal(int num) {

		int remainder = 0, octalNumber = 0;
		int j = 1;
		while (num != 0) {      //conversion of binary to decimal
			remainder = num % 10;
			octalNumber = octalNumber + remainder * j;
			j = j * 2;
			num = num / 10;
		}
		int oct[] = new int[100];
		int count = 0, sum = 0;
		while (octalNumber > 0) {       //conversion of decimal to octal
			oct[count] = octalNumber % 8;
			octalNumber = octalNumber / 8;
			count++;
		}
		for (j = 0; j <= count; j++) {     
			sum = sum + oct[j] * pow(j);
		}
		return sum;
	}

	int pow(int powerof) {           //calculate power
		int sum1 = 1, i = 0;
		for (i = 0; i < powerof; i++) {
			sum1 = sum1 * 10;
		}
		return sum1;

	}

}






