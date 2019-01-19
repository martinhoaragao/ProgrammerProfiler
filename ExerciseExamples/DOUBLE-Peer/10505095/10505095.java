import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int a = input.nextInt();
			if (a % 2 != 0) a--;
			System.out.println(a);
		}
	}
}