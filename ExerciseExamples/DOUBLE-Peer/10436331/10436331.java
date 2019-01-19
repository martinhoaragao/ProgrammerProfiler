import java.util.Scanner;

class Main {

	private static int testCases;

	public static void main(String str[]) throws Throwable {
		Scanner sc = new Scanner(System.in);
		testCases = sc.nextInt();
		while (testCases-- > 0) {
			int n=sc.nextInt();
			if(n%2==0)
				System.out.println(n);
			else
				System.out.println(--n);
		}

		sc.close();
	}
}