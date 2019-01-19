/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		long t=sc.nextLong();
		while(t-->0)
		{
		    BigInteger n=sc.nextBigInteger();
		    BigInteger d=BigInteger.valueOf(2);
		    if((n.mod(d)).equals(BigInteger.ZERO))
		    {
		        System.out.println(n);
		    }
		    else
		    {
		        System.out.println(n.subtract(BigInteger.ONE));
		    }
		}
	}
}
