/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static long ans(long n)
    {
        long num=n/2+n/3+n/4;
        if(num>n)
        return ans(n/2)+ans(n/3)+ans(n/4);
        else
        return n;   
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    while(sc.hasNext())
	    {
		long n=sc.nextLong();
		System.out.println(ans(n));
	    }
	}
}
