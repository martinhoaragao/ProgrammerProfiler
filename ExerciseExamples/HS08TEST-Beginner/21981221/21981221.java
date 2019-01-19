

import java.util.Scanner;

 class ATM {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		double out = scn.nextDouble();

		double in = scn.nextDouble();

		if ((out+0.50) > in || (out % 5) != 0) {
			System.out.printf("%.2f", in);
		} else {
			in = in - out - 0.50;
			System.out.printf("%.2f", in);
		}
	}

}
