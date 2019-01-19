import java.math.BigInteger;
import java.util.Scanner;
class factor
{
	public static void main(String args[])
	{
		int t;
		BigInteger a;
		Scanner scan=new Scanner(System.in);
		t=scan.nextInt();
		while(t>0)
		{
			a=scan.nextBigInteger();
			System.out.println("1");
			System.out.println(a);
		    t--;
		}
	}
}     