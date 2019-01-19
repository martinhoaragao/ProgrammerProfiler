/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t,n;
		t = sc.nextInt();
		while(t-->0){
			n = sc.nextInt();
			int id[] = new int[n];
			int sum[] = new int[n];
			int res=0;
			for(int i=0;i<n;i++){
				id[i] = sc.nextInt();
				sum[i] = sc.nextInt();
				res += id[i] - sum[i];
			}
			System.out.println(res);
		}
	}
}