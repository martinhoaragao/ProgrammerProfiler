import java.math.BigInteger;
import java.util.Scanner;
class demo
{
	public static void main(String args[])
	{
		int t;
		BigInteger b;
		Scanner s=new Scanner(System.in);
		t=s.nextInt();
		for(;t>0;t--)
		{
			b=s.nextBigInteger();
			System.out.println("1\n"+b);
		}
	}
} 