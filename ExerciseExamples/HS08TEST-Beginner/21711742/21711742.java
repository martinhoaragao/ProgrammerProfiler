import java.text.DecimalFormat;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double withdraw = input.nextInt();
		double balance = input.nextDouble();
		DecimalFormat df = new DecimalFormat("####.00");
		if (balance - withdraw - 0.5 >= 0 && withdraw % 5 == 0) {
			System.out.println(df.format(balance - withdraw - 0.5));
		} else {
			System.out.println(df.format(balance));
		}
	}
}
