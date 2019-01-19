import java.io.*;
import java.util.Scanner;
class coinBank
{
	long coinValue,coinDollar;
	long calcDollar(long coinValue)
	{
		long coinDollar = (coinValue / 2) + (coinValue / 3) + (coinValue / 4);
		if(coinValue < coinDollar)
		{
			return calcDollar(coinValue / 2) + calcDollar(coinValue / 3) + calcDollar(coinValue / 4);
		}
		else
		{
			return coinValue;
		}
	}
}
class byteLandian extends coinBank
{
	public static void main(String[] args) throws IOException
	{
		coinBank ob = new coinBank();
		long dollar;
		long coin,i;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLong())
		{	
			coin = sc.nextLong();
			dollar = ob.calcDollar(coin);
			System.out.println(dollar);
		}
	}
}