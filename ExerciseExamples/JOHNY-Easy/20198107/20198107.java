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
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int i,c;
	while(t>0)
		{
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    for(i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		       
		    }
		     int a=sc.nextInt();
		    
		     c=arr[a-1];
		Arrays.sort(arr); 
		   for(i=0;i<n;i++)
		  {
		      if(c==arr[i])
		   break;
		   
		}
	System.out.println(i+1);
		t--;
	}}}