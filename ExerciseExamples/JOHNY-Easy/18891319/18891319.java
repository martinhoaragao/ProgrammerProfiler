
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int t=s.nextInt();
		
		for(int i=0;i<t;i++)
		{
			int n=s.nextInt();
			int[] arr=new int[n];
			
			for(int j=0;j<n;j++)
			{
				arr[j]=s.nextInt();
			}
			
			int k=s.nextInt();
			
			int count=0;
			
			for(int l=0;l<n;l++)
			{
				if(arr[l]<arr[k-1])
					count++;
			}
			System.out.println(count+1);
			
		}
		
	}
}	