import java.util.Scanner;

public class Main {
	public static int[] a=new int[100001];
	public static void main(String[] args) 
	{
		for(int i=0;i<=100000;i++)
		{
			a[i]=Math.max(i,a[i/2]+a[i/3]+a[i/4]);
			//System.out.println(a[i]);
		}
		Scanner e=new Scanner(System.in);
		while(e.hasNext())
		{
			long n=e.nextInt();
			System.out.println(coins(n));
		}
		e.close();
	}
	public static long coins(long n)
	{
		if(n<=100000)
		{
			return a[(int)n];
		}
		return Math.max(n,coins(n/2)+coins(n/3)+coins(n/4));
	}
}
