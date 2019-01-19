import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int x = 0;
		while (x != 42) {
			x = scanner.nextInt();
			if (x != 42) System.out.println(x);
		}
		scanner.close();
	}
}