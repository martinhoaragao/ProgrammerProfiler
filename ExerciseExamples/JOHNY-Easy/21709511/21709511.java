import java.util.*;
class Hello {
	
	public static void main(String[] args )
	{
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		
		while(t-->0)
		{
			
			int n=sc.nextInt();
			
			int a[]=new int[n];
			
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			
			int k=sc.nextInt();
			
			int p=0;
			
			for(int i=0;i<n;i++)
			{
				if(a[k-1]>a[i])
				{
					p++;
				}
			}
			
			System.out.println(p+1);
			
			
			
			
		}
		
		
	}

}
