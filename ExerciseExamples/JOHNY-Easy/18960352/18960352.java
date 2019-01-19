/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Johny
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
		    int n, k, ar[], num, index;
		    n = Integer.parseInt(br.readLine());
		    String str[] = br.readLine().trim().split(" ");
		    k = Integer.parseInt(br.readLine());
		    ar = new int[n];
		    for(int i=0; i<n; i++) ar[i] = Integer.parseInt(str[i]);
		    num = ar[k-1];
		    Arrays.sort(ar);
		    index = Arrays.binarySearch(ar, num);
		    System.out.println(index+1);
		}
	}
}