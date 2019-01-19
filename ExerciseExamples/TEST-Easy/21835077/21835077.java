import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean isToContinue = true; // read an integer from input stream.
		int n = scanner.nextInt(); // read an integer from input stream.
		while (isToContinue) {
			if (n != 42) {
				System.out.println(n);
				n = scanner.nextInt();
			} else {
				isToContinue = false;
			}

		}
		scanner.close();

	}

}
