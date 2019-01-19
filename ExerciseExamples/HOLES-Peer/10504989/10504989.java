import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int result = 0;
			String line = input.next();
			for (int j = 0; j < line.length(); j++) {
				char c = line.charAt(j);
				if (c == 'A' || c == 'D' || c == 'O' 
				 || c == 'P' || c == 'Q' || c == 'R')
					result++;
				else if (c == 'B')
					result += 2;
			}
			System.out.println(result);
		}
	}
}