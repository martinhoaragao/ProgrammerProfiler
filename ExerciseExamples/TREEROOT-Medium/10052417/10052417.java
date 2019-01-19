import java.io.*;
import java.util.Scanner;
class Unidirected{
	public static void main(String args[]){
		int sum=0;
		int sum1=0;
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i =0;i<t;i++){
			sum=0;
			sum1=0;
			int n = scan.nextInt();
			for(int j=0;j<n;j++){
				int x = scan.nextInt();
				int y = scan.nextInt();
				sum = sum+x;
				sum1 = sum1+y;	
			}
			System.out.println(sum-sum1);
		}
	
	}
}