/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static long coin (long n)
	{
		
		
		
		long x=n/2 +n/3 +n/4;
		if(x>n){ return coin(n/2)+coin(n/3)+coin(n/4);}
		else {
		  return n;
		}
	}
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		do{
			long n=sc.nextLong();
			System.out.println(coin(n)); 
		}	
			while(sc.hasNextLong());
		
	}
}
