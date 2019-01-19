/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		float y=sc.nextFloat();
		if(x%5==0 && x<=(y-0.5))
		{
			y-=(float)(x);
			y-=0.5;
		}
		System.out.printf("%.2f",y);
	}
}