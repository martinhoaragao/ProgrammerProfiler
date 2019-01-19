import java.io.*;
import java.util.*;

class JOHNY
{
	public static void main(String args[]) throws Exception
	{
		Scanner s = new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=s.nextInt();
			int a[]=new int[n];
			for(int j=0;j<n;j++)
				a[j]=s.nextInt();
			int pos=s.nextInt();
			int v=a[--pos],temp;
			for(int j=0;j<n;j++)
			{
				for(int k=0;k<n-j-1;k++)
				{
					if(a[k]>a[k+1])
					{
						temp=a[k];
						a[k]=a[k+1];
						a[k+1]=temp;
					}
				}
			}
			for(int j=0;j<n;j++)
			{
				if(a[j]==v)
				{
					System.out.println(++j);
					break;
				}
			}
		}
	}
}