import java.util.*;
 
class maza
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		long n;
		while(sc.hasNextLong())
		{
			n=sc.nextLong();
			System.out.println(max(n));
		}
		sc.close();
	}
	static long max(long n)
	{
		long n1;
		n1=(n/2)+(n/3)+(n/4);
		if(n1>n)
			return max(n/2)+max(n/3)+max(n/4);
		else
			return n;
	}
}  