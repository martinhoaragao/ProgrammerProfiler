

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < t; i++) {
			int N = scanner.nextInt();
			scanner.nextLine();
			int root=0;
			for (int j = 0; j < N; j++) {
				root+=(scanner.nextInt()-scanner.nextInt());
				scanner.nextLine();
			}
			System.out.println(root);
		}

	}
}
