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
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0){
		    t--;
		    int n=s.nextInt();
		    int[] a=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=s.nextInt();
		    }
		    int k=s.nextInt();
		    k=a[k-1];
		  //  System.out.println(k);
		    Arrays.sort(a);
		  //  System.out.println(Arrays.toString(a));
		    int i=0;
		    while(i<n){
		        if(a[i]==k)
		            break;
		        i++;
		    }
		    System.out.println(i+1);
		}
	}
}
