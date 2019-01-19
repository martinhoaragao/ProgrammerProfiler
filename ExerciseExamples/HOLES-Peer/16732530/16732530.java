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
	
	    int test_cases,count;
	    String input;
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    test_cases=Integer.parseInt(br.readLine());
	    while(test_cases-->0)
	    {
	        input=br.readLine();
	        count=0;
	        for(int i=0;i<input.length();i++)
	        {
	            char current_letter=input.charAt(i);
	            if(current_letter=='B')
	            {
	                count+=2;
	            }
	            if(current_letter=='Q' || current_letter=='R' || current_letter=='O' || current_letter=='P' || current_letter=='A' || current_letter=='D')
	            {
	                count++;
	            }
	        }
	        System.out.println(count);
	    }
	}
}
