/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) 
	{
		Scanner in=new Scanner(System.in);
	
		try
	{
	    int t=in.nextInt();
	
	for(int l=0;l<t;l++)
		{
		int h=0;
		String a=in.next();
		String b=a.toUpperCase();
		
		char c[]=b.toCharArray();
		
		if(t<0||t>40)throw new RuntimeException("throws demo");
		if(c.length>99)throw new RuntimeException("throws demo");
		
		
		for(int i=0;i<c.length;i++)
{		
		
		if((c[i]=='A')||(c[i]=='D')||(c[i]=='O')||(c[i]=='P')||(c[i]=='Q')||(c[i]=='R'))
		h++;
		else
		{
		
		  	if(c[i]=='B')
		    h=h+2;
		   }	
}		
		
		
		System.out.println(h);
		}
		
		}
	catch(Exception e)
	{}
	
	}
	}
	