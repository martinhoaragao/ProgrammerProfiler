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
		try
		{
			Scanner sc= new Scanner(System.in);
			ArrayList<Integer> input=new ArrayList<Integer>();
			ArrayList<Integer> output=new ArrayList<Integer>();
			int n=0;
			while(true)
			{
				n=sc.nextInt();
				if(n!=42)
					output.add(n);
				else
				    break;
			}
			
			for(int temp:output)
				System.out.print(" " + temp);

		}
		catch(Exception e)
		{	System.out.println(e);}
		    
	}
}
