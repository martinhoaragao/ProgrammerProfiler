import java.io.*;
import java.lang.*;
import java.util.*;

class TREEROOT{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] id = new int[n];
			int[] sum= new int[n];
			int total=0;
			for(int i=0;i<n;i++){
				id[i]=sc.nextInt();
				sum[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++){
				total-=sum[i];
			}
			for(int i=0;i<n;i++){
				total+=id[i];
			}
			System.out.println(total);
		}
	}
}