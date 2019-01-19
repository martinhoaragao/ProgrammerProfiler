import java.util.Arrays;
import java.util.Scanner;

class Codechef {
	public static void main(String[] args) throws Exception {
		Scanner reader = new Scanner(System.in);
		int t = reader.nextInt();
		int n;
		int k;
		for (int i = 0; i < t; i++) {
			n = reader.nextInt();
			int[] h = new int[n];
			for (int j = 0; j < n; j++) {
				h[j] = reader.nextInt();
			}
			/* Arrays.sort(h); */
			k = reader.nextInt();
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
