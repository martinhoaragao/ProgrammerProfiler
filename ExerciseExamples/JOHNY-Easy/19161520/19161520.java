import java.util.*;
class G
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int j,r=0;
			int a[]=new int[n];
			for(j=0;j<n;j++)
			{
				a[j]=sc.nextInt();
			}
			int k=sc.nextInt();
			int x=a[k-1];
			Arrays.sort(a);
			for(j=0;j<n;j++)
			{
				if(a[j]==x)
				{
					r=j+1;
					break;
				}
			}
			System.out.println(r);
 
			
		}
	}
} 