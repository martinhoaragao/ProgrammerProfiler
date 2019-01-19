import java.util.*;

class Vish {
	public static void main(String[] args) {
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		for (int i=0 ; i<t ; i++) {
			int n = sc.nextInt();
			if (n%2 == 0) {
				System.out.println(n);
			} else {
				System.out.println(n - 1);
			}
		}
	}
}
