/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in = new Scanner(System.in);
		int T,X,a=0;
		char ch;
		T=in.nextInt();
		String name;
		for(int i=0;i<T;i++)
		{ 
		   name=in.next();
		   X=name.length();
		   a=0;
		   for(int j=0;j<X;j++)
		   {
		       ch=name.charAt(j);
		       if(ch=='A' || ch=='D' || ch=='O' || ch=='P' || ch=='R' || ch=='Q')
		       {
		           a++;
		       }
		       if(ch=='B')
		       {
		           a+=2;
		       }
		   }
		   System.out.println(a);
		}
	}
}
