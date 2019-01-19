/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class NoOfHoles
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s1=new Scanner(System.in);
		int t=s1.nextInt();
		String str;
		s1.nextLine();
		while(t-->0)
		{
		    int c=0;
		    str=s1.nextLine();
		    str=str.toUpperCase();
		    for(int i=0;i<str.length();i++)
		    {
		        char ch=str.charAt(i);
		        if(ch=='A'||ch=='D'||ch=='O'||ch=='P'||ch=='Q'||ch=='R')
		        c++;
		        else if(str.charAt(i)=='B')
		        c=c+2;
		    }
		    System.out.println(""+c);
		}
	}
}
