import java.util.*;
class survive
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++)
		{
			int size = sc.nextInt();
			int arr[]=new int[size];
			for(int j=0;j<size;j++)
			{
				arr[j]=sc.nextInt();
 
			}
			int find = sc.nextInt();
			int z = arr[find-1];
			 Arrays.sort(arr);
 
			 for(int k=0;k<size;k++)
			 {
			 	if(arr[k]==z)
			 		System.out.println(k+1);
			 }
 
		}
	}
} 