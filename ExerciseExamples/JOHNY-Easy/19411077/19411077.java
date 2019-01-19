import java.util.Scanner;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main
{
public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  
		int n = input.nextInt(); 
		
		for(int i=0;i<n;i++)
		{
			int size=input.nextInt(); 
			int arr[]=new int[size];
			for(int j=0;j<size;j++)
			{
				arr[j]=input.nextInt(); 
			}
			int k=input.nextInt(); 
			int num=arr[k-1];
			Arrays.sort(arr);
			for(int j=0;j<size;j++)
			{
				if(num==arr[j])
					System.out.println(j+1);
			}
			
		}
	}
}