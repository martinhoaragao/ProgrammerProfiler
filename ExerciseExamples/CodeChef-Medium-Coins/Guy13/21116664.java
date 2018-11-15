/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static long  calc(long n)
    {
        if(n/2+ n/3+ n/4 >n)
        return calc(n/2) + calc(n/3) + calc(n/4);
        else
        return n;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
    	int t=10;
    	for(t=10;t>0;t--){
    	long n=s.nextLong();
    	System.out.println(calc(n));
	  }
	}
}
