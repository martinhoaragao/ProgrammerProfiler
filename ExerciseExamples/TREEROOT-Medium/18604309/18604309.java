import java.util.Scanner;
 
class TREEROOT {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			int sum = 0;
			for (int j = 0; j < n; j++) {
				int x = in.nextInt();
				int y = in.nextInt();
				sum += (x - y);
			}
			System.out.println(sum);
		}
	}
}