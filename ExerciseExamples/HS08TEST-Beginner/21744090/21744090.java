import java.util.Scanner;
class ATM {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int withdrawal = scan.nextInt();
		double balance = scan.nextDouble();
		if ( (withdrawal % 5 == 0) && (withdrawal+0.50) < balance ) {
			double leftBalance = (balance - withdrawal) - 0.50;
			System.out.println(leftBalance);
		} else if (withdrawal > balance) {
			System.out.println(balance);
		} else {
			System.out.println(balance);
		}
		scan.close();
	}
}