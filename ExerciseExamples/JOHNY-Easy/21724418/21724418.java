import java.util.Arrays;
import java.util.Scanner;

class EasyUncleJohny {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		while(N-- > 0){
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i = 0 ; i < n ; i++){
				a[i] = sc.nextInt();
			}
			int find = sc.nextInt();
			int song = a[find-1];
			Arrays.sort(a);
			System.out.println(Arrays.binarySearch(a, song)+1);
		}
	}

}
