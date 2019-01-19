import java.util.Scanner;
class TreeRoot
{
	public static void main(String args[])
	{
		Scanner S=new Scanner(System.in);
		int t=S.nextInt();
		while(t-->0)
		{
			int n=S.nextInt();
			int root=0;
			for(int i=0;i<n;i++)
			{
				int id=S.nextInt();
				int sum=S.nextInt();
				root=root+id-sum;
			}
			System.out.println(root);
		}
	}
} 