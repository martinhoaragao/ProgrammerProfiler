import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while (T-- > 0) {

			int count = 0;

			String A = null;
			if (scan.hasNext()) {
				A = scan.next();
			}
			String[] s = A.split("");

			for (int i = 0; i < s.length; i++) {

				if (s[i].equals("A") || s[i].equals("D") || s[i].equals("O") || s[i].equals("P") || s[i].equals("Q")
						|| s[i].equals("R")) {

					count++;

				}
				if (s[i].equals("B")) {
					count += 2;
				}
			}
			System.out.println(count);

		}
	}

}
