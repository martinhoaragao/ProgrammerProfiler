import java.util.Arrays;
import java.util.Scanner;

class JOHNY {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		while(T > 0) {
			int j = 0;
			int N = in.nextInt();
			int A[] = new int[N];
			
			for(int i = 1; i <= N; i++)
				A[i - 1] = in.nextInt();
			
			int k = in.nextInt();
			int fav = A[k - 1];
			Arrays.sort(A);
			for(j = 1; j <= N; j++) {
				if(A[j - 1] == fav)
					break;
			}
			System.out.println(j);
			
			T--;
		}
		in.close();
	}
}