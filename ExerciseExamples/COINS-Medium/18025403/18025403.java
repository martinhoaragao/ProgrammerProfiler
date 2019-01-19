import java.util.*;
public class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t=10;
		while(t-->0)
		{
		long n = sc.nextLong();
		long ans = 0;
		if(n<12)
		ans = n;
		else
		ans = mod(n/2)+mod(n/3)+mod(n/4);
		System.out.println(ans);
		}
	}
	public static long mod(long n)
	{
		if(n<12)
		return n;
		if((n/2+n/3+n/4)==n)
		return n;
		return (mod(n/2)+mod(n/3)+mod(n/4));
	}
}