import java.util.Scanner;

class Double {
	private static Scanner sc;

	private static int palindrome2Double(int n) {
		if (n % 2 == 1) {
			return n-1;
		}
		return n;
	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int k = sc.nextInt();
		for (int i=0; i<k; i++) {
			System.out.println(palindrome2Double(sc.nextInt()));
		}
	}
}

