import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int withdrawal = s.nextInt();
		float balance = s.nextFloat();
		float remaining = balance - withdrawal - 0.5f;
		
		if (withdrawal % 5 != 0)
		{
		    System.out.printf("%.2f", balance);
		}
		else if (remaining < 0)
		{
		    System.out.printf("%.2f", balance);
		}
		else
		{
		    System.out.printf("%.2f", remaining);
		}
	}
}
