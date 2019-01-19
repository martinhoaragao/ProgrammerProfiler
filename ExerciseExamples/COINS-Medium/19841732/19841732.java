import java.util.Scanner;
public class Main {
	public static void main(String  args[]) {
		//System.out.println("ff");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			long N = sc.nextLong();
			System.out.println(rec(N));
		}
		
		
		
	}
	static long rec(long n) {
		if(n < 12) {
			return n;
		}
		return  Math.max(n, rec(n/2) + rec(n/3) + rec(n/4));
		
	}
}

