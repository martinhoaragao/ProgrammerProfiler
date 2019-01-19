import java.util.Scanner;
import  java.util.*;
public class Main {
	private static HashMap<Long, Long> map;
	public static void main(String  args[]) {
		//System.out.println("ff");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			map = new HashMap<Long, Long>();
			long N = sc.nextLong();
			System.out.println(rec(N));
		}
		
		
		
	}
	static long rec(long n) {
		if(n <= 2) {
			return n;
		}
		if(map.get(n) != null) {
			return map.get(n);
		}
		long x = Math.max(n, rec(n/2) + rec(n/3) + rec(n/4));
		map.put(n, x);
		return x;
		
	}
}

