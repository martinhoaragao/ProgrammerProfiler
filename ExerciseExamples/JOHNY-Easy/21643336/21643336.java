/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int a=1;a<=t;a++)
		{
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			int k=sc.nextInt();
			int pos=arr[k-1];
			int flag=0;
			Arrays.sort(arr);
			int j=0;
			for(j=0;j<n;j++)
			{
				if(arr[j]==pos)
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			System.out.println(j+1);
		}
	}
}