import java.util.*;

class Root
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t>0)
		{
			int i,troot=0,tsum=0;
			int n=sc.nextInt();
			int root[]=new int[n];
			int sum[]=new int[n];
			for(i=0;i<n;i++)
			{
				root[i]=sc.nextInt();
				sum[i]=sc.nextInt();
				troot+=root[i];
				tsum+=sum[i];
			}
			System.out.println(troot-tsum);
			t--;
		}
	}
}