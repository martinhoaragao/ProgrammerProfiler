import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		while (scanner.hasNextInt()) {
			int len = scanner.nextInt();
			boolean isEven = len % 2 == 0;
			System.out.println(isEven ? len : len - 1);
		}
	}
} 