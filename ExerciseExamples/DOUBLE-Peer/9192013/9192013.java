import java.util.Scanner;

class Problem { 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int length = in.nextInt();
			if (length % 2 == 1) {
				length -= 1;
			}
			System.out.println(length);
		}
		in.close();
	}
}