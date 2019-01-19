import java.util.*;
class A
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=s.nextInt();
			int p=0;;
			for(int j=0;j<n;j++)
			{
				int x=s.nextInt();
				int id=s.nextInt();
				p+=x-id;
			}
			System.out.println(p);
		}
	}
}