/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
	        while (in.hasNext()){
	            long n= in.nextLong();
	            System.out.println(get_val(n));
	        }
	}
	
	static long get_val(long n){
		
		if(n<12) return n;
		else return get_val(n/2)+ get_val(n/3)+ get_val(n/4);
		
	}
	
	
}
