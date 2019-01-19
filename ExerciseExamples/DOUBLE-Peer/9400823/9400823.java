import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < T; i++) {
			int N = scan.nextInt();
			scan.nextLine();
			
			if (N % 2 == 0) {
				System.out.println(N);
			} else {
				System.out.println(N - 1);
			}
		}
		scan.close();

	}
}
