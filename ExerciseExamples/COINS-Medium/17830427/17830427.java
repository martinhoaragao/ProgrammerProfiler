import java.util.*;
public class Main 
{
	
	
	private static long coin(long n)
	{
		  long sum=n/2+n/3+n/4;
		  
		return sum>n ? coin(n/2)+coin(n/3)+coin(n/4):n;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		while( sc.hasNext())
		{
			long n=sc.nextLong();
		
		System.out.println(coin(n));
		}
		
	}

}
