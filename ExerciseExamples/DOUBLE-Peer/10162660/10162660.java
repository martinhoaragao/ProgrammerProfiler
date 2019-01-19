import java.util.Scanner;
class name
{
	public static void main(String []arg)
	{
		Scanner s=new Scanner(System.in);
			int t=s.nextInt();
			while(t-->0)
			{
				int n=s.nextInt();
				if(n%2==0)
				System.out.println(n);
				else
				System.out.println(n-1);
			}
		s.close();
	}
}