/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in =new Scanner(System.in);
		int t=in.nextInt();
		for(int i=0;i<t;i++)
		{
			int f=in.nextInt();
			if (f%2==1) f=f-1;
		     System.out.println(f);
		}
	}
}