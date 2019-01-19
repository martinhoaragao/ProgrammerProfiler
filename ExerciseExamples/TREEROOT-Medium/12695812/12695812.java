/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	      Scanner sc = new Scanner(System.in);
	      int t  = sc.nextInt();
	      while(t-->0)
	      {
	            int p = sc.nextInt();
	             int n=0,k=0;
	            while(p-->0)
	            {
	           
	         n += sc.nextInt();
	         k += sc.nextInt(); }
	     	System.out.println(n-k);

	}
}
}
