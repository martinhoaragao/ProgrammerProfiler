import java.io.*;
import java.util.*;

class Test{
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i=0; i<n; i++){
				a[i] = sc.nextInt();
			}
			int k = sc.nextInt();
			int x = a[k-1];
			int p = 1;
			for(int i=0;i<n;i++){
				if(a[i]<x)
					p++;
			}
			System.out.println(p);
		}
	} 
}
















