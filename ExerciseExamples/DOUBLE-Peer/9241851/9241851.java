import java.util.Scanner;
class f
{
	public static void main (String[] args)
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for (int i=0;i<t;i++)
		{
			int a=in.nextInt();
			if (a%2==0)
			{
				System.out.println(a);
			}
			else
			{
				System.out.println(a-1);
			}
		}
    }
}