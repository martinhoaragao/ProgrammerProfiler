import java.util.Scanner;

class HolesInTheText {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			String s = scanner.next();
			int count = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == 'B')
					count = count + 2;
				if (s.charAt(j) == 'A' || s.charAt(j) == 'D' || s.charAt(j) == 'O' || s.charAt(j) == 'P'
						|| s.charAt(j) == 'Q' || s.charAt(j) == 'R')
					count = count + 1;
			}
			System.out.println(count);
		}
		scanner.close();
	}

}
