

import java.util.HashMap;
import java.util.Scanner;

public class Main{
	static HashMap<Long, Long> dp =new HashMap<Long, Long>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n=0;
		while(sc.hasNext()){
		 n =sc.nextLong();
		 if(dp.containsKey(n)){
			 System.out.println(dp.get(n));
			 continue;
		 }
			 
		long result =getlong(n);
		System.out.println(result);
		}
		
	}
	static long getlong(long n){
		if(n==0)
			return 0;
		if(dp.containsKey(n)){
			return dp.get(n);
		}
		long res = getlong(n/2) 
				+ getlong(n/3)
				+getlong(n/4);
		dp.put(n, Math.max(res,n));
		return dp.get(n);
	}
}
