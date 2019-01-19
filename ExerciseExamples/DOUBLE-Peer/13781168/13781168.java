import java.util.Scanner;
class doublestring
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		if(t>=1 && t<=10000)
		{
			for(int ti=0;ti<t;ti++)
			{
				int n=s.nextInt();
				if(n%2==0)
					System.out.println(n);
				else
					System.out.println(n-1);
			}
		}
	}
}