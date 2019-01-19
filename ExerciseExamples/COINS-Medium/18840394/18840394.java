import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan=new Scanner(System.in);
		while(scan.hasNextLong())
		{
        long n=scan.nextLong();
        System.out.println(calculate(n));
		}
	}
	public static long calculate(long n){
	    if(n<12){
	        return n;
	    }
	    else{
	        return calculate(n/2)+calculate(n/3)+calculate(n/4);
	    }
	}
}  