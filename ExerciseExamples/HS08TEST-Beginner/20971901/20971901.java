/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		double y = in.nextDouble();
		
		double c;
		
		if ( (x%5==0) && ((x+0.5)<y) )
		{
			c = y-x-0.50;
			System.out.printf("%.2f",c);
		}
		
		else
			System.out.printf("%.2f",y);
		
	}
}