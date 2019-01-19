/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
//	System.out.println("enter number of test cases");
	int t=sc.nextInt();
	
	int i,j,n,k,l,temp,ans,z;
	
	for(i=0;i<t;i++)
	{
	 // System.out.println("enter number of terms");
	  n=sc.nextInt();
	  int str[]=new int[n];
	  for(j=0;j<n;j++)
	  {
	      str[j]=sc.nextInt();
	  }
	  //System.out.println("term where it is present");
	  int x=sc.nextInt();
	  int term=str[x-1];
	 // System.out.println(term);
	  for(k=0;k<n-1;k++)
	  {
	      for(l=0;l<n-k-1;l++)
	      {
	          if(str[l]>str[l+1])
	          {
	              temp=str[l];
	              str[l]=str[l+1];
	              str[l+1]=temp;
	          }
	      }
	  }
	  ans=0;
	  for(z=0;z<n;z++)
	  {
	      if(str[z]==term)
	      {
	          ans=z+1;
	      }
	  }
	  term=0;n=0;
	
	  System.out.println(ans);
	}
	}
}
