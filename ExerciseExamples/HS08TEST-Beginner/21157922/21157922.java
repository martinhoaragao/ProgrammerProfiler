import java.util.Scanner;
class BankAtm {
	public static void main(String[] args) {
		double initial;
		int withdrawl;
		Scanner sc = new Scanner(System.in);
		withdrawl = sc.nextInt();
		initial = sc.nextDouble();
		BankAtm ba = new BankAtm();
		double result = ba.withDrawal(withdrawl, initial);
		System.out.println(result);
		sc.close();
	}
	
	public double withDrawal(int withDrawalAmmount, double initialAmmount) {
		if (initialAmmount >= (withDrawalAmmount + 0.5)) {
			if (withDrawalAmmount % 5 == 0) {
				initialAmmount = initialAmmount - (withDrawalAmmount + 0.5);
				return initialAmmount;
			}
		}

		return initialAmmount;

	}
}

