import java.io.*;
import java.util.*;
class COINS
{
	public static void main(String[] args) throws IOException
	{
		Scanner in =new Scanner(System.in);
		do
		{			
			long n= in.nextLong();
			System.out.println(profit(n)); 
		}while(in.hasNextLong());
	}
	
	static long profit(long n)
	{
		if(n/12> 0)
			return profit(n/2)+profit(n/3)+profit(n/4);
		else
			return n;
	}
}