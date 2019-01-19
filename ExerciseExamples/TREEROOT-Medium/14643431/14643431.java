import java.util.Scanner;
class TREEROOT 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int root=0;
			int n=sc.nextInt();
			for(int i=0;i<n;i++)
			{
				int a=sc.nextInt();
				int b=sc.nextInt();
				root+=a-b;
			}
			System.out.println(root);
		}

	}
}
