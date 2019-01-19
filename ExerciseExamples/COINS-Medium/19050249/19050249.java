import java.util.*;
import java.lang.*;
class Solution{
	static long[] a=new long[100000000];
	public static long getValue(long n){
		if(n<=11)
			return n;
		if(n<100000000){
			if(a[(int)n]!=0)
				return a[(int)n];
			a[(int)n]=Math.max(n, getValue(n/2)+getValue(n/3)+getValue(n/4));
			return a[(int)n];
		}
		return Math.max(n,getValue(n/2)+getValue(n/3)+getValue(n/4));
	}
		public static void main (String[] args) 
		{
			Scanner s=new Scanner(System.in);
			while(s.hasNext()){
				long n=s.nextLong();
				System.out.println(getValue(n));
			}
		}
}