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
		int t,k,n;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
		    n=sc.nextInt();
		    int ans=0;
		    int a[]=new int[n];
		    for(int j=0;j<n;j++)
		    a[j]=sc.nextInt();
		    k=sc.nextInt();
		    int check=a[k-1];
		    Arrays.sort(a);
		    //System.out.println(check);
		    for(int j=0;j<n;j++)
		    {
		        //System.out.print(a[j]+" ");
		        if(a[j]==check)
		        {
		            ans=j+1;
		            break;
		        }
		    }
		    System.out.println(ans);
		}
	}
}
