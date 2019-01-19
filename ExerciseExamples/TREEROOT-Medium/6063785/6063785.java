/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		while(t-- >0){
			int n=s.nextInt(),iSum=0,sSum=0;
			
			int[] index = new int[n],sum=new int[n];
			for(int i=0;i<n;i++){
				index[i]=s.nextInt();
				iSum+=index[i];
				sum[i]=s.nextInt();
				sSum+=sum[i];
			}
			System.out.println(iSum-sSum);
		}
	}
}
