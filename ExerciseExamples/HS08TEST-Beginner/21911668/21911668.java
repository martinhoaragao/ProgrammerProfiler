import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		int withdraw = reader.nextInt(); // Scans the next token of the input as an int.
		double amount = reader.nextDouble();
		if(withdraw % 5 != 0) {
			System.out.printf("%.2f", amount);
			return;
		}
		if(amount - withdraw - 0.5 < 0) {
			System.out.printf("%.2f", amount);
			return;
		}
		System.out.printf("%.2f", amount - withdraw - 0.5);
		//once finished
		reader.close();
		
	}
}
