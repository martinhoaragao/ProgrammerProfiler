/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static int i;
	public static void main (String[] args) throws java.lang.Exception
	{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	Scanner sc = new Scanner(System.in);
	    long n;
	    while(sc.hasNextLong())
	    {
	    	n=sc.nextLong();
	    	System.out.println(addcoins(n));
	    }
    }
    
    static long addcoins(long n)
	{
		long sum;
		sum=(n/2)+(n/3)+(n/4);
		if(sum>n)
			return addcoins(n/2)+addcoins(n/3)+addcoins(n/4);
		else
			return n;
	}
}
