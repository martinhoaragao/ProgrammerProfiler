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
		BufferedReader buf= new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt((buf.readLine()).trim()), count=0, j;
		String temp;
		for(int i=1; i<=a; i++){
		temp=((buf.readLine()).trim());
		for(j=0;j<temp.length();j++)
		
		{if(temp.charAt(j)=='A' || temp.charAt(j)=='D' || temp.charAt(j)=='O' || temp.charAt(j)=='P' || temp.charAt(j)=='Q' || temp.charAt(j)=='R' )
		count++;
		else if(temp.charAt(j)=='B')
		count=count+2;}
		System.out.println(count);
		    count=0;
		}
	}
}
