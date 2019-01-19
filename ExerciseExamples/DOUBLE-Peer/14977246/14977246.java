import java.io.*;
import java.lang.*;
import java.util.*;

class DOUBLE
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int t;
		long n;
		t = sc.nextInt();
		while(t>0)
		{
		 n = sc.nextLong();
		 if(n%2==0) 
			System.out.println(n);
		 else
			System.out.println(n-1);
		 t--;
		}
	}
	
}