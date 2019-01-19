import java.util.*;
import java.io.*;
class BytelandianGoldCoins
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc= new Scanner(System.in);
		do
		{			
			int n= sc.nextInt();
			System.out.println(profit(n)); 
		}while(sc.hasNextLong());
	}
	
	static long profit(int n)
	{
		if(n/12> 0)
			return profit(n/2)+profit(n/3)+profit(n/4);
		else
			return n;
	}
}