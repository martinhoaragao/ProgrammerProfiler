import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			if (n % 2 == 0)
				System.out.println(n);
			else
				System.out.println(n - 1);
		}
		scanner.close();
	}

}