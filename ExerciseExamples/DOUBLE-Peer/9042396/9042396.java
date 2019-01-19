import java.util.Scanner;
class Double
{
	public static void main(String [] args)
	{
		int t,i;
		long n;
		Scanner kb=new Scanner(System.in);
		t=kb.nextInt();
		for(i=1;i<=t;i++)
		{
			n=kb.nextLong();
			if(n%2==0)
				System.out.println(n);
			else
				System.out.println(n-1);
		}
	}
}