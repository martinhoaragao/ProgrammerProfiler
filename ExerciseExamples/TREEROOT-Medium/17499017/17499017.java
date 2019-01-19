import java.util.Scanner;

class TreeRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int sum = 0;
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				sum += (x - y);
			}
			System.out.println(sum);
		}
	}
}
