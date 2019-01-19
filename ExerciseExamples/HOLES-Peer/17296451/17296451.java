/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    int count=0;
	    for(int i=0;i<t;i++)
	    {
	        String s=br.readLine();
	        for(int j=0;j<s.length();j++)
	        {
	            char c = s.charAt(j);
	            if(c=='A' || c=='D' || c=='O' || c=='P' || c=='Q' || c=='R')
	                count++;
	            else if(c=='B')
	                count+=2;
	            else
	                continue;
	        }
	        System.out.println(count);
	        count=0;
	    }
	}
}
