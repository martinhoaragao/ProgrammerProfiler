/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
		    long n=in.nextLong();
		    long ans=solve(n);
		    System.out.println(ans);
		}// your code goes here
	}
	
	static long solve(long n)
	{
	    long a=n/2+n/3+n/4;
	    if(a>n)
	    {
	        return (solve(n/2)+solve(n/3)+solve(n/4));
	    }
	    else
	        return n;
	}
}
