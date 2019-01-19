/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
	public static void main (String[] args)
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t!=0)
		{
			int n=s.nextInt();
			int id=0,sum=0;
			int a[][]=new int[n][2];
			for(int i=0;i<n;i++)
			{
				a[i][0]=s.nextInt();
				a[i][1]=s.nextInt();
				id=id+a[i][0];
				sum=sum+a[i][1];
			}
			System.out.println(id-sum);
			t--;
		}
		s.close();
	}
}
