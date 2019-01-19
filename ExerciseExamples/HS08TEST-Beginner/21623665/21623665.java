
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final double CHARGE = 0.50; //(1,2000)
		short withdrawal = sc.nextShort(); //ma byc podzielne przez 5
		float balance = sc.nextFloat(); //(0,2000)
		if(withdrawal % 5 == 0 && withdrawal <= balance-CHARGE )
			balance = (float) (balance - withdrawal - CHARGE);
		System.out.printf("%.2f",balance);
	}

}