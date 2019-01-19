import java.util.*;
import java.io.*; 
public class Main
{
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		int T=0;
		while(T++<10)
		{
			long coin=in.nextLong();
			System.out.println(conv(coin));
		}
	}
	
	
	public static long conv(long coin)
	{
		if(((coin/2)+(coin/3)+(coin/4))>coin)
		{
			return (conv(coin/2)+conv(coin/3)+conv(coin/4));
		}
		return coin;
	}
}  