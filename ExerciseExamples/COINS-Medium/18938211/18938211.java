import java.util.*;


class Coins
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<10;i++)
		{
			long number=scan.nextLong();
			System.out.println(max(number));
		}
	}
	static long max(long number)
	{
		long number1;
		number1=(number/2)+(number/3)+(number/4);
		if(number1>number)
			return max(number/2)+max(number/3)+max(number/4);
		else
			return number;
	}
	
	
}