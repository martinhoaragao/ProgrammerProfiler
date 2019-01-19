/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{   
    static long f(long n){
        if(n<12) return (long)n;
        return Math.max(n,(f(n/2)+f(n/3)+f(n/4)));
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s= new Scanner(System.in);
	    while(s.hasNext()){
	        long n=s.nextLong();
	        System.out.println(f(n));
	    }
	}
}
