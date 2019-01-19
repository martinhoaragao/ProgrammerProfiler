//package codechef;

import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while(t-->0){
			int n = in.nextInt();
			int[] id = new int[n];
			int[] sum = new int[n];
			for(int i=0;i<n;i++){
				id[i] = in.nextInt();
				sum[i] = in.nextInt();
			}
			
			int root = 0;
			
			for(int i=0;i<n;i++){
				root = root+id[i];
				root = root - sum[i];
			}
			
			System.out.println(root);
		}
	}

}
