import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int amount = keyboard.nextInt();	
		double balance = keyboard.nextDouble();
		if(balance < amount + 0.5 || amount % 5 != 0)
			System.out.printf("%.2f", balance);
		else
			System.out.printf("%.2f",balance - amount - 0.5);
	}
}
