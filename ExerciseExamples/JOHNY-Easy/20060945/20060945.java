import java.util.Scanner;
import java.util.Arrays;

class Demo 
{
	public static void main(String[] args)
	{
    Scanner scan =new Scanner(System.in);
	int t =scan.nextInt();
	for(int i=0;i<t;i++)
	{
		int n=scan.nextInt();
		int[] arr;
		arr =new int[n];
		for(int j=0;j<n;j++)
			arr[j]=scan.nextInt();
		int k =scan.nextInt();
		int check = arr[k-1];

		int count=1;
		for(int j=0;j<n;j++)
			if(arr[j]<check)
				count++;
		
		System.out.println(count);
	 
	}
	}
}
		