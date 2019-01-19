/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    	public static Map<Long,Long> memo = new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) {
			long k = sc.nextInt();
			System.out.println(getmax(k));
		}
		sc.close();
	}
	
	public static long getmax(long a) {
		if(a<=11 && a>=0) {
			memo.put(a, a);
			return a;
		} else if(memo.containsKey(a)) {
			return memo.get(a);
		} else {
			long max1 = (int)Math.floor(a/2);
			long max2 = (int)Math.floor(a/3);
			long max3 = (int)Math.floor(a/4);
			long result = getmax(max1) + getmax(max2) +getmax(max3);
			memo.put(a,result);
			return result;
		}
	}
}
