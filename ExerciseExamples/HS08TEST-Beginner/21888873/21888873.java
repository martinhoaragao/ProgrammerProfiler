import java.util.Scanner;

class ATM {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		int withdraw = kb.nextInt();
		float deposit = kb.nextFloat();
		float total;

		if (withdraw + 0.5 <= deposit) {
			if (withdraw % 5 == 0) {
				total = (float) ((deposit - (withdraw + 0.5)));
				System.out.printf("%.2f", total);
			} else {
				System.out.printf("%.2f", deposit);
			}
		} else {
			System.out.printf("%.2f", deposit);

		}

	}

}
