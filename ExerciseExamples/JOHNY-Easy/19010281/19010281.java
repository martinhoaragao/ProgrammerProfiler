import java.io.*;
import java.util.*;

class play{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0){
			int n= sc.nextInt();
			int d[] = new int[n];
			for(int i=0;i<n;i++){
				d[i]=sc.nextInt();
			}
			int k =sc.nextInt();
			int q=d[k-1];
			Arrays.sort(d);
			int j =Arrays.binarySearch(d,q);
			System.out.println(j+1);
			t--;
		}
	}
}