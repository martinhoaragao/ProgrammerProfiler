import java.util.Arrays;
import java.util.Scanner;

class UncleJohny {
	
	private static void check(int[] a, int k) {

		int songLength = a[k-1];
		
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++)
			if(a[i] == songLength)
				System.out.println(i+1);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int t = scanner.nextInt();

		for (int i = 0; i < t; i++) {

			int n = scanner.nextInt();

			int a[] = new int[n];

			for (int j = 0; j < n; j++) {
				a[j] = scanner.nextInt();
			}

			int k = scanner.nextInt();

			check(a, k);
		}

		scanner.close();
	}

}