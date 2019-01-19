

import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // Number of test Cases
		int i, j, l;
		for (i = 1; i <= T; i++) {
			int N = sc.nextInt();
			int[] arr = new int[N + 1];
			arr[0] = 0;
			for (j = 1; j <= N; j++) { // Loop for taking input of Length of the songs
				arr[j] = sc.nextInt();
			}
			int k = sc.nextInt(); // index of Uncle John before sorting
			int comp = arr[k];
			for (j = 1; j <= N; j++) {
				int min = j;
				for (l = j + 1; l <= N; l++) {
					if (arr[l] < arr[min])
						min = l;
				}
				int temp = arr[min];
				arr[min] = arr[j];
				arr[j] = temp;

			}
			for (j = 1; j <= N; j++) {
				if(arr[j] == comp)
				System.out.println(j);

			}

		}

	}

}
