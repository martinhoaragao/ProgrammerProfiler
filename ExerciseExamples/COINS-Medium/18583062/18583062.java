import java.util.*;
class Byte {
	public static long sol(long n) {
		long k = n/2 + n/3 + n/4;
		if(k > n)
			return sol(n/3) + sol(n/2) + sol(n/4);
		else
			return n;
	}
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = 10;
		while(t-- > 0) {
			long n = sc.nextLong();
			long ans = sol(n);
			System.out.println(ans);		
		}
	}
}