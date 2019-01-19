import java.math.BigInteger;
import java.util.Scanner;
class factor
{
	public static void main(String args[])
	{
		int t;
		BigInteger b;
		Scanner scan=new Scanner(System.in);
		t=scan.nextInt();
		while(t!=0)
		{
			b=scan.nextBigInteger();
			System.out.println("1");
			System.out.println(b);
		    t--;
		}
	}
}   