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
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t>0)
		{
		    String s=in.next();
		    int count=0;
		    for(int i=0;i<s.length();i++)
		    {
		        if(s.charAt(i)=='A' || s.charAt(i)=='D' || s.charAt(i)=='O' || s.charAt(i)=='P' || s.charAt(i)=='Q' || s.charAt(i)=='R')
		        {
		            count++;
		        }
		        else if(s.charAt(i)=='B')
		        {
		            count+=2;
		        }
		    }
		    System.out.println(count);
		    t--;
		}
	}
}
