import java.util.*;
class doustrings
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			long n=sc.nextLong();
			if(n%2==0)
			{
				System.out.println(n);
			}
			else
			{
				System.out.println(n-1);
			}
		}
	}
}