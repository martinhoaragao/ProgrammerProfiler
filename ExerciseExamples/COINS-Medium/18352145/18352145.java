/* package whatever; // don't place package name! */


/* Name of the class has to be "Main" only if the class is public. */
import java.util.Scanner;

class Solution{
	public static int[] a=new int[100001];
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		long n,ans;
		int i;
		for(i=0;i<=100000;i++){
			a[i]=Math.max(i,a[i/2]+a[i/3]+a[i/4]);
		}
		for(i=0;i<10;i++){
		n = sc.nextLong();
		ans = coins(n);
		System.out.println(ans);
		}
	}
	public static long coins(long n){
		if(n<=100000){
			return a[(int)n];
		}
		
		return Math.max(n,coins(n/2)+coins(n/3)+coins(n/4));
	}
}