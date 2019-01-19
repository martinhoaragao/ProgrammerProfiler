/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		while(s.hasNext()){
		    long x=breakdown(s.nextLong());
		    System.out.println(x);
		}
		
	}
	static long breakdown(long t){
	    if(t<12)
	        return t;
	    return Math.max(t,breakdown(t/2)+breakdown(t/3)+breakdown(t/4));
	}
}
