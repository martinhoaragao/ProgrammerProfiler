
import java.util.Scanner;

 class Snippet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		while (x < 100) {

			if (x == 42)
				break;
			System.out.println(x);
			x = scanner.nextInt();
		}
	}
}
