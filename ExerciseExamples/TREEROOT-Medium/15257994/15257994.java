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
		Scanner src = new Scanner(System.in);
		int t = src.nextInt();
		int n;
		
		int sumids = 0;
		int sumchild = 0;
		for(int i = 0;i<t;i++)
		{
		    n = src.nextInt(); //no of nodes
            sumids = 0;
            sumchild = 0;
		    for(int j = 0;j<n;j++)
		    {
		        sumids += src.nextInt();
		        sumchild += src.nextInt();
		       
		    }
		    System.out.println(sumids - sumchild);
		}
	}
}
