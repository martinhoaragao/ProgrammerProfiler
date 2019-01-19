/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t,n,k;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t-->0){
        	n=sc.nextInt();
        	int a[]=new int[n]; 
        	for(int i=0;i<n;i++){
        		a[i]=sc.nextInt();
        	}
        	k=sc.nextInt();
        	int m;
        m=a[k-1];
          Arrays.sort(a);
          for(int j=0;j<n;j++){
          	if(a[j]==m)
          	 System.out.println(j+1);
          }
        }
	}
}