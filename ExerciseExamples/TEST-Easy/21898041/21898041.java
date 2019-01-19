import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int x = 0;
		while (x != 42) {
			x = reader.nextInt();
			if (x != 42) {
				System.out.println(x);
			}
		}

	}

}