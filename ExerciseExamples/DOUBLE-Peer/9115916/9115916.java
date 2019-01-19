import java.util.*;


class HolesInTheText {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x % 2 == 0) {
				System.out.println(x);
			} else {
				System.out.println(x-1);
			}
		}

		sc.close();
	}

}
