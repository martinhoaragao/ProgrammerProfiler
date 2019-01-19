/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			long n = in.nextLong();
			long ans = coin(n);
			System.out.println(ans);
		}
		
	}
		public static long coin(long n)
	            {
		    long m = n / 2 + n / 3 + n / 4;
		    if(m <= n)
		    return n;
		    else
		    return coin(n / 2) + coin(n / 3) + coin(n / 4);
	            }
}