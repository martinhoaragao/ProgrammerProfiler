import java.util.Scanner;

public class Main  {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N;
		int T = scn.nextInt();
		
		for (int i=0; i<T; i++) {
			N = scn.nextInt();
			if (N % 2 == 0) {
				System.out.println(N);
			}
			else {
				System.out.println(N-1);
			}
		}
	}
}