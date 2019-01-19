
import java.util.*;
 class hello2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		int i ;
		int j ;
		int n ;
		int k ;
		int l ;
		for(i=1;i<=testcase;i++)
		{
			n = sc.nextInt();
			int songl[] = new int[n];
			for(l=0;l<=n-1;l++)
			{
				songl[l]=sc.nextInt();
			}
			k = sc.nextInt();
			int ujl = songl[k-1];
			int counter = 0 ;
			for(j=0;j<=n-1;j++)
			{
				if(j==k-1)
				{
					continue ;
				}
				if(ujl>songl[j])
				{
					counter++ ;
				}
			}
			System.out.println(counter+1);
			
			
			
			
		}
	}
}