/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s=new Scanner(System.in);
	    
	    while(s.hasNextLong()){
	        long n=s.nextLong();
	        System.out.println(denomination(n));
	        
	    }
	}
	
	public static long denomination(long n){
	    if(n<12)
	        return n;
	    long x1=n/2;
	    long x2=n/3;
	    long x3=n/4;
	    long sum=denomination(x1)+denomination(x2)+denomination(x3);
	    return sum;
	}
}
