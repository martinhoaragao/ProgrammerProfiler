
import java.util.Scanner;

class ATM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int amount = sc.nextInt();
		double balance = sc.nextDouble();

		if ((amount % 5 == 0 )&& ((amount + 0.50) < balance)) {
			
			balance = balance - (amount + 0.50);

		}

		System.out.printf(String.format("%.2f", balance));

	}

}
