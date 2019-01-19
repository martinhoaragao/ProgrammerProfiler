import java.util.*;

class Main{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		try
		{
			int t=input.nextInt();
			while (t-->0)
			{
				int n,k,i,s=0,f=0;
				n=input.nextInt();
				int[] a=new int[n];
				for (i=0;i<n;i++)
				{
					a[i]=input.nextInt();
				}
				k=input.nextInt();
				s=a[k-1];
				Arrays.sort(a);
				for (i=0;i<n;i++)
				{
					if (a[i]==s)
					{
						f=i;
					}
				}
				System.out.println(f+1);
			}
		}
		catch (Exception e)
		{}
	}
}
