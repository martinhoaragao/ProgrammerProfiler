import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int T = in.nextInt();

		for(int i = 0; i < T; i++) {
			int n = in.nextInt();
			if(n % 2 == 0)	System.out.println(n);
			else 			System.out.println(n-1);
		}
	}
}