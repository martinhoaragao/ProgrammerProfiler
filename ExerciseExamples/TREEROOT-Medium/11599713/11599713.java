import java.io.*;
import java.util.*;
class TREEROOT{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test--!=0){
			int n=sc.nextInt();
			int sum=0;
			for(int i=0;i<n;i++){
				sum+=(sc.nextInt()-sc.nextInt());
			}
			System.out.println(sum);
		}
	}
}