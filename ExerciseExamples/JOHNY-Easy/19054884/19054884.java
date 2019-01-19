import java.util.*;

public class Main {
	
	public static long SmallestDiff(int [] a) {
		long min = Long.MAX_VALUE;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length-1;j++) 
			{
				min = Math.min(Math.abs(a[i]-a[j]), min);
			}
		}
		return min;
	}
	
	
	
	
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test!=0)
		{
			int n = sc.nextInt();
			int [] arr = new int[n];
			for(int i=0;i<n;i++) 
			{
				arr[i] = sc.nextInt();
			}
			int k = sc.nextInt();
			int key = arr[k-1];
			Arrays.sort(arr);
			System.out.println(1 + Arrays.binarySearch(arr, key));
			test--;
		}
		sc.close();
		///
	}
}