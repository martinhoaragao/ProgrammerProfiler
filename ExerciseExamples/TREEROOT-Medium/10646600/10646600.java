/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t,n,i,j;
		t=sc.nextInt();
		for(i=0;i<t;i++)
		{
			n=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[n];
			int sumN=0;
			int sumC=0;
			for(j=0;j<n;j++)
			{
				a[j]=sc.nextInt();
				sumN=sumN+a[j];
				b[j]=sc.nextInt();
				sumC=sumC+b[j];
			}
			System.out.println(sumN-sumC);
		}
	}
}