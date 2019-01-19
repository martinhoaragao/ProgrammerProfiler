import java.util.Scanner;


class TreeRoot
{
	public static void main(String args[])
	{
		int root;
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{
			root=0;
			int n=s.nextInt();
			for(int j=0;j<n;j++)
			{
				root+=s.nextInt()-s.nextInt();
			}
			System.out.println(root);
		}
		
	}
}
