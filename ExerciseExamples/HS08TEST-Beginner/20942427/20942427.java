import java.util.*;

class ATM
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		int amount=s.nextInt();
		double balance=s.nextDouble();
		
		if(amount+0.50>balance||(amount%5)!=0)
			System.out.println(balance);
		else
		{
			balance-=(amount+0.5);
			System.out.println(balance);
		}
	}
}