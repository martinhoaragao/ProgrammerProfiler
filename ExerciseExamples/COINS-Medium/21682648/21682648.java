import java.util.Scanner;

public class Main {
	public static long getCoins(long n) {
		if (n < 12) return n;
		return Math.max(n, getCoins(n/2)+getCoins(n/3)+getCoins(n/4));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			long n = sc.nextLong();
			System.out.println(getCoins(n));
		}
		sc.close();
	}
}