/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{   
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
		// your code goes here
		int t,count,i;
		String s;char str;
		t=sc.nextInt();
		//if(t>0&&t<=40){
		    while(t>0)
		    {   count=0;
		        s=sc.next();
		        for(i=0;i<s.length();i++)
		        {
		            str=s.charAt(i);
		            if(str=='A'||str=='D'||str=='O'||str=='P'||str=='Q'||str=='R')
		            count++;
		            else if(str=='B')
		            count+=2;
		        }
		        System.out.println(count);
		        t--;
		    }
		//}
	}
}
