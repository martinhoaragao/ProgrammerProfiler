import java.util.Scanner;

class HOLES {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int testCases = s.nextInt();

		String[] sArr = new String[testCases];

		for (int i = 0; i < sArr.length; i++) {
			sArr[i] = s.next();
		}

		for (int i = 0; i < sArr.length; i++) {
			method(sArr[i]);
		}

	}

	public static void method(String s) {

		int holes = 0;

		char[] cArr = s.toCharArray();
		char[] oneHoles = { 'a', 'b', 'd', 'e', 'g', 'o', 'p', 'q', 'A', 'D', 'O', 'P', 'R', 'Q' };

		for (int i = 0; i < cArr.length; i++) {

			if (cArr[i] == 'B') {
				holes += 2;
				continue;
			}

			for (int j = 0; j < oneHoles.length; j++) {

				if (cArr[i] == oneHoles[j]) {
					holes++;
				} else {
					continue;
				}
			}

		}
		System.out.println(holes);
	}


}
