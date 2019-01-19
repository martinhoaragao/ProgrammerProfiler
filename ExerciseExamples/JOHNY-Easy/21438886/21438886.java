import java.util.*;
class UncleJohny
{
	public static void main(String args[])
	{
	int i,j,temp,n,d,m,l,p,k;
	Scanner sc=new Scanner(System.in);
	l=sc.nextInt();
	for(i=0;i<l;i++)
	{
		n=sc.nextInt();
		int a[]=new int[n];
		for(j=0;j<n;j++)
			a[j]=sc.nextInt();
		m=sc.nextInt();
		p=a[m-1];
		for(j=0;j<n-1;j++)
		{
			for(k=0;k<n-j-1;k++)
			{
				if(a[k]>a[k+1])
				{
					temp=a[k];
					a[k]=a[k+1];
					a[k+1]=temp;
				}
			}
		}
		for(j=0;j<n;j++)
		{
			if(a[j]==p)
			{
				d=j+1;
				System.out.println(d);
				break;
			}
		}
				
	}
	}
}