/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    public static long maxcoin(long num)
    {
        long n1,n2,n3;
        n1=num/2;
        n2=num/3;
        n3=num/4;
        if(n1+n2+n3>num)
        {
            num=maxcoin(n1)+maxcoin(n2)+maxcoin(n3);
        }
        return num;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    long n;

	    Scanner sc=new Scanner(System.in);
	    while(sc.hasNext())
	    {
	        n=sc.nextLong();
	        System.out.println(maxcoin(n));
	    }
	    
	}
}
