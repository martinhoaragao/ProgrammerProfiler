import java.lang.*;
import java.util.*;
class Byt
{
	public static void main(String args[])
	{
		int t=10;
		Scanner s=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			
			long n=s.nextLong();
			
			System.out.println(findSum(n));
		}
	}
	public static long findSum(long n)
	{
		long sum=n/2+n/3+n/4;
		if(sum>n)
		{
			return(findSum(n/2)+findSum(n/3)+findSum(n/4));
		}
		else
		{
			return(n);
		}
	}
}