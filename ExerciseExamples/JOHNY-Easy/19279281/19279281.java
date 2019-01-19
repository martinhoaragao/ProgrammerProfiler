import java.util.Scanner;
public class Main
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++)
		{
			int n = sc.nextInt();
			
			int a[] = new int[n];
			for(int j=0;j<n;j++)
			{a[j]=sc.nextInt();}
			
			int k = sc.nextInt();
			int x = a[k-1];
			
			for(int j=0;j<n;j++)
			{
				for(int l=j+1;l<n;l++)
				{
					if(a[j]>a[l])
					{
						int t=a[j];
						a[j]=a[l];
						a[l]=t;
					}
				}
			}
			
			for(int j=0;j<n;j++)
			{
				if(x == a[j])
				{System.out.println(j+1);}
			}
		}
	}
}