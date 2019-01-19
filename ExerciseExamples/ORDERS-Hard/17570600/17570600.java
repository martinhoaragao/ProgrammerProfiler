import java.util.Scanner;

class Order
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=s.nextInt();
			int[] sold=new int[n];
			int[] rank=new int[n];
			for(int j=0;j<n;j++)
			{
				sold[j]=s.nextInt();
				rank[j]=j+1;
			}
			int x;
			for(int z=n-1;z>=0;z--)
			{

				int k=z-sold[z];
				int temp=rank[k];
				for(x=k;x<z;x++)
				{
					rank[x]=rank[x+1];
				}
				rank[x]=temp;

			}
			for(int k:rank)
			{
				System.out.print(k+" ");
			}
			System.out.print("\n");

		}

		
	}

}