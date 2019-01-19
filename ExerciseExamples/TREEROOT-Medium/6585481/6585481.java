import java.util.Scanner;
class treeroot
{
	public static void main(String[] asdf)
	{
		Scanner in = new Scanner(System.in);
		int test=in.nextInt();
		int n,i;
		int []node=new int[35];
		int []val=new int[35];
		try
		{
			while(true)
			{
				if(test==0)
				break;
				int ans=0;
				n=in.nextInt();
				for(i=0;i<n;i++)
				{
					node[i]=in.nextInt();
					val[i]=in.nextInt();
				}
				for(i=0;i<n;i++)
				{
					ans=ans-val[i];
					ans=ans+node[i];
				}
				System.out.println(ans);
				test=test-1;
			}
		}
		catch(Exception e)
		{
		}
	}
}
				