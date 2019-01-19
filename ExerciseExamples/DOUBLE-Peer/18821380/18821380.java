import java.util.Scanner;
public class Main
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int t,n;
		t=sc.nextInt();
		int ans[]=new int [t];
		for(int i=0;i<t;i++)
		{
			n=sc.nextInt();
			if(n%2==0)
				ans[i]=n;
			else
				ans[i]=n-1;
		}
		for(int i=0;i<t;i++)
			System.out.println(ans[i]);
	}
}