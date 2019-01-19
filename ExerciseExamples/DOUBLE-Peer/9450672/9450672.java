/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		int t,j,sum,i,index;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(i=0;i<t;i++)
		{
			sum=sc.nextInt();
			if(sum%2==0)
			System.out.println(sum);
			else
			System.out.println(sum-1);
		}
		
	}
}
