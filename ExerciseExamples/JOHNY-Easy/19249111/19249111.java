import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int u=0;u<T;u++) {
			int n = in.nextInt();
			int[][] arr = new int[n][2];
			for(int i=0;i<n;i++) {
				arr[i][0] = in.nextInt();
				//arr[i][1] = i;
			}
			int k = in.nextInt();
			arr[k-1][1] = 1;
			sort(arr,0,n);
			//for(int i=0;i<n;i++) {
			//	for(int j=0;j<2;j++) {
			//		System.out.print(arr[i][j]+" ");
			//	}
			//	System.out.println();
			//}
			int c=0;
			for(int i=0;i<n;i++) {
				if(arr[i][1]!=(1)) {
					c++;
				}
				else if(arr[i][1]==(1)) {
					c++;
					break;
				}
			}
			//if(c==1) {
			//	System.out.println(c);
			//}
			//else
				System.out.println(c);
		}

	}
	
	public static void sort(int[][] a, int low, int high) {
		int Y = high-low;
		if(Y<=1)
			return;
		int mid = low + Y/2;
		sort(a,low,mid);
		sort(a,mid,high);
		int i=low , j=mid;
		int[][] temp = new int[Y][2];
		for(int k=0;k<Y;k++) {
			if(i==mid)
				temp[k] = a[j++];
			else if(j==high)
				temp[k] = a[i++];
			else if(a[j][0]<a[i][0])
				temp[k] = a[j++];
			else
				temp[k] = a[i++];
		}
		for(int k=0;k<Y;k++) {
			a[low+k] = temp[k];
		}
	}

}
