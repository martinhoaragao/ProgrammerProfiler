import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cases = s.nextInt();
		while (cases > 0) {
			int number = s.nextInt();
			if (number % 2 == 0) {
				System.out.println(number);
			} else {
				System.out.println(number - 1);
			}
			cases--;
		}
	}
} 