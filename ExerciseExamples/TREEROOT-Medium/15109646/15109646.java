import java.util.*;
class treeroot
{
	public static void main(String[] args)
	{
		int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		while(t-->0)
		{
		int sum=0;
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		sum=sum+(sc.nextInt()-sc.nextInt());
		System.out.println(sum);
		}
	}
} 