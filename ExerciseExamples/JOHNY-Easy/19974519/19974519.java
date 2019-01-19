import java.util.Scanner;  
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    int c=0;
		    for(int i=0;i<n;i++)
		    {
		        if(arr[m-1]>=arr[i])
		        c++;
		    }
		    System.out.println(c);
		}
	}
}
