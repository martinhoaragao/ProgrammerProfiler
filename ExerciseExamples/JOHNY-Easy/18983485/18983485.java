import java.util.Scanner;
import java.util.Arrays;
class Solution{
	public static void main(String args[])
	{
	Scanner scan = new Scanner (System.in);
	int t = scan.nextInt();
	while(t-->0)
	{
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = scan.nextInt();
		int k = scan.nextInt();
		int m = arr[k-1];
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
			if(arr[i] == m)
				System.out.println(i+1);
	}
}
}