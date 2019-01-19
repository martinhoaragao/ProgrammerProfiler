import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		float bal=sc.nextFloat();
		
		if(n+0.50<=bal && n%5==0)
		    System.out.printf("%.2f",bal-n-0.50);
		    
	    else System.out.printf("%.2f",bal);
	}
}