import java.util.*;
class COINS
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			long n=sc.nextLong();
			n=f(n);
			System.out.println(n);
		}
	}
	public static long f(long n)
	{
		return (n<12)?n:(f(n/4)+f(n/3)+f(n/2));
	}
}