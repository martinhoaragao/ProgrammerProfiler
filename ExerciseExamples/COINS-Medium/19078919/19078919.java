import java.io.*;
import java.lang.*;
import java.util.*;
class Bytelandian 
{
	private static long exchange(long coin) 
	{
		long c1 = coin / 2;
		long c2 = coin / 3;
		long c3 = coin / 4;
		long sum = c1+c2+c3;
		
		return (sum > coin) ? exchange(c1)+exchange(c2)+exchange(c3) : coin;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<10;i++)
		{
			long n;
			//System.out.println("Enter the value of n ");
			n=sc.nextLong();
			System.out.println(exchange(n));
		}
			
	}

	

}
