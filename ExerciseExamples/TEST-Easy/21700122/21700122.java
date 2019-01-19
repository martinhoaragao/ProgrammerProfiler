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
		ArrayList<Integer> list=new ArrayList<Integer>();
	    Scanner sc=new Scanner(System.in);
		int element;
		for(int j=0;j<=list.size();j++)
		{
		    element=sc.nextInt();
		    list.add(element);
		    if(list.get(j)!=42)
		    {
		        System.out.println(list.get(j));
		    }
		    else
		    {
		        break;
		    }
		        
		}
	}
}
