/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   
	   Scanner sc=new Scanner(System.in);
	   int T;
       T=sc.nextInt();
	  for(int j=0;j<T;j++)
	  {
	     
	     int n=sc.nextInt();
         int a[]=new int[n];
	     for(int i=0;i<n;i++)
	     {
	         a[i]=sc.nextInt();
	     }
	     int k=sc.nextInt();
	     int l=a[k-1];
	     Arrays.sort(a);
	     int p=Arrays.binarySearch(a,l);
	     System.out.println(p+1);
	  }
	}
}
