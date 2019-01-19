import java.util.*;
class Johny 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
	
		Scanner sc=new Scanner(System.in);

		int t=sc.nextInt();
		
		for(int j=0;j<t;j++)		
		{
			int n=sc.nextInt();
			int arr[]=new int[n];

			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
				
			}

			int k=sc.nextInt();

			solve(n,arr,k);

			
		}


	}

	public static void solve(int n,int arr[],int k)
	{
		int temp=arr[k-1];

		Arrays.sort(arr);
		for(int i=0;i<n;i++)
		{
			if(arr[i]==temp)
			{
				System.out.println((i+1));
				return;
			
			}
		
		}
	
	
	}

}
