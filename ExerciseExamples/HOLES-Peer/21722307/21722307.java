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
		int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
		    String s=sc.next();
		    int ctr=0;
		    for(int j=0;j<s.length();j++)
		    {
		        char c=s.charAt(j);
		        if(c=='A' || c=='D' || c=='O' || c=='P' || c=='Q' || c=='R')
		        ctr++;
		        if(c=='B')
		        ctr=ctr+2;
		        
		    }
		    System.out.println(ctr);
		}
	}
}
