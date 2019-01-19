import java.util.Scanner;

class JOHNY
{

public static void main(String args[])
{
Scanner p=new Scanner(System.in);
	int t=p.nextInt();
	while(t!=0)
	{
		int n=p.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		a[i]=p.nextInt();
		}
		int u=p.nextInt();
		u=a[u-1];
		int index=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]<u)
				{
					index++;
					
				}
		}
		System.out.println(index+1);
		t--;
	}
}

}