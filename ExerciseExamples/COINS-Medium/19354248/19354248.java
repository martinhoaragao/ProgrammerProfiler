/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
   static long Coin(long n)
    {
           long sum = (n/2)+(n/3)+(n/4);
		    if(sum>n)
		        return Coin(n/2)+Coin(n/3)+Coin(n/4);
		    else
		        return n;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		long n;
		do{
		    n=sc.nextLong();
		 System.out.println(Coin(n));
		    
		}while(sc.hasNextLong());
	}
}
