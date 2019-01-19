import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int withdAmt = in.nextInt();
		double actBal = in.nextDouble();
		in.close();
		final double bankCharges = 0.5;
		
		double remainingBal = actBal - withdAmt - bankCharges;

		if (withdAmt <= 0 || withdAmt > 2000 || actBal < 0 || actBal > 2000 || withdAmt%5 != 0 || remainingBal <= 0) {
			System.out.println(actBal);
		} else {
			System.out.println(remainingBal);
		}
	}
}