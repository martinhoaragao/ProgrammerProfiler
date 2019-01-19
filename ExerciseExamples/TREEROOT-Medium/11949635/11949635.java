import java.util.Scanner;

class dum1
{
	public static void main(String[] args)
	{
		int i,j,k;
		int t;
		Scanner sc = new Scanner(System.in);

		t=sc.nextInt();

		for(i=0;i<t;i++)
		{
			int m,a=0;
			m=sc.nextInt();
		
			for(j=0;j<m;j++)
			{
				a+=sc.nextInt();
				a-=sc.nextInt();
			}
			System.out.println(a);
		}
	}
}