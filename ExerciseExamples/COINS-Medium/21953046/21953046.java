/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{   static long maxDenomination(long n){
        if(n<12){
            return n;
        }
        long sum=maxDenomination(n/2)+maxDenomination(n/4)+maxDenomination(n/3);
        return sum;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		long n;
		while(sc.hasNext()){
		    n=sc.nextLong();
		    System.out.println(maxDenomination(n));
		}
	}
}
