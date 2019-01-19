/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t;
		t=Integer.parseInt(br.readLine());
		//	System.out.println(t);
		for(int i=0;i<t;i++)
		{
		
		int n=Integer.parseInt(br.readLine());
		if((n&1)==1)
		System.out.println(n-1);
		else
		System.out.println(n);
				}
	}
}