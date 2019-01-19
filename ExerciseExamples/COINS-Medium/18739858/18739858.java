import java.util.Scanner;

public class Main {

	static long getMax(long n) {
		if((n/2 + n/3 + n/4) > n) {
			return (getMax(n/2) + getMax(n/3) + getMax(n/4));
		}
		else {
			return n;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		long n;
		String line;
		while(s.hasNext()) {
			n = s.nextLong();
			System.out.println(getMax(n));
		}
	}
}
