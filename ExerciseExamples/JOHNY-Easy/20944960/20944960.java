/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws IOException
	{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int T=Integer.parseInt(br.readLine());
	    while(T-->0)
	    {
	        int n=Integer.parseInt(br.readLine());
	        String s[]=br.readLine().split(" ");
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++)
	        arr[i]=Integer.parseInt(s[i]);
	        int k=Integer.parseInt(br.readLine());
	        int val=arr[k-1],p=0;
	        Arrays.sort(arr);
	        for(int i=0;i<n;i++)
	        {
	            if(arr[i]==val)
	            {
	                p=i+1;
	                break;
	            }
	        }
	        System.out.println(p);
	    }
	}
}
