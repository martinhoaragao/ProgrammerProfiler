import java.util.*;
 
class Four
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T!=0)
		{	
			int i,j;
			int N=sc.nextInt();
			int arr[]=new int[N];
			for(i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
			}
			int K=sc.nextInt();
			int temp=arr[K-1];
			for(i=0;i<arr.length;i++)
			{
				for(j=0;j<arr.length;j++)
				{
					if(arr[i]<=arr[j])
					{
						int temp1=arr[i];
						arr[i]=arr[j];
						arr[j]=temp1;
					}
				}
			}
			for(i=0;i<arr.length;i++)
			{
				if(arr[i]==temp)
					{
						System.out.println(i+1);
					}
					
			}
			T--;
		}
	}
}  