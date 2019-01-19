import java.util.*;
class Uncle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int size=sc.nextInt();
			int a[]=new int[size];
			for(int j=0;j<size;j++)
			{
				a[j]=sc.nextInt();
			}
			int k=sc.nextInt();
			int len=a[k-1];
			int index=0;
			Arrays.sort(a);
			for(int n=0;n<size;n++)
			{
				if(a[n]==len)
				{
					index=n+1;
					break;
				}
			}
			System.out.println(index);
		}
	}
}