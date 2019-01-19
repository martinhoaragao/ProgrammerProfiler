import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		int tests;
		Scanner scanner = new Scanner(System.in);

		tests = scanner.nextInt();
		for (int i = 0; i < tests; i++) {
			int sigmaNodes = 0;
			int sigmaChild = 0;
			int nodes = scanner.nextInt();

			for (int j = 0; j < nodes; j++) {
				int one = scanner.nextInt();
				int two = scanner.nextInt();
				sigmaChild += two;
				sigmaNodes += one;
			}
			System.out.println(sigmaNodes - sigmaChild);
		}

	}

}
