import java.util.*;
class Demo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt(),k=0,i=0,var=0;
			int a[]=new int[n];
			for(i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			k=sc.nextInt();
			var=a[k-1];
			Arrays.sort(a);
			for(i=0;i<n;i++)
			{
				if(a[i]==var)
				{
					System.out.println(i+1);
					break;
				}
			}
		}			
	}
}
