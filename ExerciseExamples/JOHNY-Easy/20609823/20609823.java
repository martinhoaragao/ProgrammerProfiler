import java.util.Arrays;
import java.util.Scanner;

class Codechef {
	public static void main(String[] args)
	 {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n;
		int k;
		for (int i = 0; i < t; i++) {
			n =sc.nextInt();
			int[] h = new int[n];
			for (int j = 0; j < n; j++) {
				h[j] = sc.nextInt();
			}

			k = sc.nextInt();
			int temp = h[k - 1];
			Arrays.sort(h);
			for (int j = 0; j < n; j++) {
				if (h[j] == temp) {
					System.out.println(j + 1);
				}
			}
		}
	}

}
