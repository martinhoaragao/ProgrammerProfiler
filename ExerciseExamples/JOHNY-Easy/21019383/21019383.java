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
		for(int i =0;i<t;i++){
			int n = in.nextInt();
			double A[];
			A = new double[n];
			
			for(int j =0;j<n;j++){
				
				A[j] = in.nextDouble();
			}
			int k = in.nextInt();
			int count =1;
			for(int j=0;j<n;j++){
			if( A[k-1] > A[j] ){count++;}
			}
			System.out.println(count);
			
		}
		
	}
}