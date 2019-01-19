/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main(String args[] ) throws Exception    
	{
		Scanner sc=new Scanner (System.in);
		int x=sc.nextInt();
		float y=sc.nextFloat();
		float z;
		
		
		if(x<=(y-0.5)&&x%5==0)
		
		{

			z = y-x;
			
			z=z-(0.5f);

			System.out.println(String.format("%.2f", z));

		}
		
		
		else

		{
		
			System.out.println(String.format("%.2f", y));

		}		
	}

}
