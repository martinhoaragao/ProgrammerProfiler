/* package codechef; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws IOException,NumberFormatException
	{
	    try
	    {
	        Scanner sc = new Scanner(System.in);
	        int count = sc.nextInt();
	        while(count!=0)
	        {
	            int n = sc.nextInt();
	            if(n%2==0)System.out.println(n);
	            else System.out.println(n-1);
	            count--;
	        }
	        
	    }
	    catch(Exception e)
	    {
	        
	    }
	}
}
