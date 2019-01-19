import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		while (count-- != 0) {
			int nodes = scanner.nextInt();
			int root = 0;
			while (nodes-- != 0) {
				int x = scanner.nextInt();
				int y = scanner.nextInt();
				root += (x - y);
			}
			System.out.println(root);
		}
		scanner.close();
	}

}