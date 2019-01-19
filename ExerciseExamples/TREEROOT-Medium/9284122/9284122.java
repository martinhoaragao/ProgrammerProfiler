import java.io.*;
import java.util.*;
class root
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int root=0;
			for(int j=0;j<n;j++)
			{
				int id  = sc.nextInt();
				int sum = sc.nextInt();
				
				root  = root + (id - sum);
			}
			System.out.println(root);
		}
	}
}