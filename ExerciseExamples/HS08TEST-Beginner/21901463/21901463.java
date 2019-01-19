import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int x = reader.nextInt();
		double y = reader.nextDouble();

		if (x % 5 != 0) {
			System.out.println(y);
		}
		else if (x + 0.5 > y) {
			System.out.println(y);
		}
		else {
			System.out.println(y - (x + 0.5));
		}
	}

}