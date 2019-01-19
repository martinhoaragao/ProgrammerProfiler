/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int h = 0 ; h < t ; h++)
		{	int n = in.nextInt();
			int a[] = new int[n];
			for(int i = 0 ; i < n ; i++)
			{
				a[i] = in.nextInt();
			}
			int k = in.nextInt();
			int y = a[k-1];
			for(int i = 0 ; i < n ; i++)
			{
				for(int j = i+1 ; j < n ; j++)
				{
					if(a[j] < a[i])
					{
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
				
			}
			int u = 0;
			for(int i = 0 ; i < n ; i++)
			{
				if( a[i] == y)
				{
					u = i+1 ;
				}
			}
			System.out.println(u);
				
		}
		
	}
}