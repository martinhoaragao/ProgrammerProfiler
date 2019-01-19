/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i=0;i<t;i++)
		{
			int nodes = sc.nextInt();
			int root = 0;
			while (nodes-- != 0)
			{
				int a = sc.nextInt();
				int b = sc.nextInt();
				root += (a - b);
			    
			}
        	System.out.println(root);
    	}
	}
 
} 
