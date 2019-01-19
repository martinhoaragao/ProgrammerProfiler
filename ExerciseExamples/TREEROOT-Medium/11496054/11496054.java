import java.util.*;
class tree_root {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<a;i++)
		{
			int b=sc.nextInt();
			int sum=0;
			for(int j=0;j<b;j++)
			{
				int c=sc.nextInt();
				int d=sc.nextInt();
				sum=sum+c-d;
			}
			System.out.println(sum);
		}
	}
}
