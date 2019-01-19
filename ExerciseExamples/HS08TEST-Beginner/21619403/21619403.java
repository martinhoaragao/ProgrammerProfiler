/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t;
		double p;
		Scanner in= new Scanner(System.in);
		t=in.nextInt();
		p=in.nextDouble();
		if(p>(t+0.5)&&(t%5==0))
			System.out.printf("%.2f\n",(double)p-t-0.5);
		else
			System.out.printf("%.2f\n",(double)p);
	}
}