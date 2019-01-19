import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0)
		{
		    long n = sc.nextLong();
		    if(n%2==1)
		    {
		        n=n-1;
		    }
		    System.out.println(n);
		}
	}
}
