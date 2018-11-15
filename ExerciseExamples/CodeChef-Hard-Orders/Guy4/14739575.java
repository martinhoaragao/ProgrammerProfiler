import java.util.*;
class Ordering_the_soldiers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[n];
			for(int j=0;j<n;j++)
			{
				a[j]=j+1;
				b[j]=sc.nextInt();
			}
			int x;
			for(int j=n-1; j>=0; j--)
			{
				int k = j - b[j];
				int temp = a[k];
				for( x=k; x<j; x++)
				{
					a[x] = a[x+1];
				}	
				a[x] = temp;
			}
			for(int j=0;j<n;j++)
			{
				System.out.print(a[j]+" ");
			}
			System.out.println("");
		}
	}
}