/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t;
		t=Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    int n;
		    n=Integer.parseInt(br.readLine());
		    if(n%2==1)
		        n--;
		    System.out.println(n);
		}
	}
}
