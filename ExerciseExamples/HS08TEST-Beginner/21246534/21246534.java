import java.util.Scanner;

class ATM {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Double initialBalance, withdrawalAmount;
		withdrawalAmount = scan.nextDouble();
		initialBalance = scan.nextDouble();
		if(withdrawalAmount%5 != 0 || ((initialBalance-withdrawalAmount-0.5)<0)) {
			System.out.println(initialBalance);
		}else {
			System.out.println(initialBalance-withdrawalAmount-0.5);
		}
		scan.close();
	}

}