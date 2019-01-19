/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t,i,j,co;
		String s;
		char c;
	
		t=sc.nextInt();
		for(i=0;i<t;i++)
		{
		s=sc.next();
		co=0;
		for(j=0;j<s.length();j++)
		{
			c=s.charAt(j);
			if(c=='B')
			co=co+2;
			else if(c=='A'||c=='D'||c=='O'||c=='P'||c=='Q'||c=='R')
			co=co+1;
			
		}
	System.out.println(co);
		}
		
	}
}