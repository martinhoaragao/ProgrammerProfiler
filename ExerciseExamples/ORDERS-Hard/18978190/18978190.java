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
		int n,temp,t,pos;
		int[] a,m;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		while(t>0)
		{
			n=sc.nextInt();
			a=new int[n];
			m=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				m[i]=i+1;
			}
			for(int i=n-1;i>0;i--)
			{
				if(a[i]>0)
				{
					pos=i-a[i];
					temp=m[pos];
					for(int j=a[i];j>0;j--)
					{
						m[pos]=m[pos+1];
						pos++;
					}
					m[i]=temp;
				}
			}
			for(int x=0;x<n;x++)
			{
				System.out.println(m[x]);
			}
		t--;
		}

	}
}
