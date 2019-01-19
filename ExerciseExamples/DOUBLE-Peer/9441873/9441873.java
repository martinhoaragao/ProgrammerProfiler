import java.util.Scanner;

class DoubleStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			if (n%2 == 0) {
				System.out.println(n);
			}
			else System.out.println(n-1);
		}
	}
}