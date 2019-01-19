import java.lang.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s = r.readLine();
		long c = Long.parseLong(s);
		long n = 0;
		long v = 0;
		for (long i=0;i<c;i++){
			n = Long.parseLong(r.readLine());
			v = fv(n);
			System.out.println(Long.toString(v));
		}
	}
	public static long fv(long n){
	    long val = 0;
	    if(n%2==1){
	      return fv(n-1);
	    }
	    return n;
	}
}