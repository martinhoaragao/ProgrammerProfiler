import java.util.Scanner;
import java.math.*;
class Demo
{
	public static long sum(long num)
	{
		long sum=0;
		long arr[]=new long[3];
		arr[0]=num/2;
		arr[1]=num/3;
		arr[2]=num/4;
		sum=arr[0]+arr[1]+arr[2];
	        if(sum>num)
				num =(sum(arr[0])+sum(arr[1])+sum(arr[2]));
		return num;
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNext())
		{
			long n=s.nextLong();
			System.out.println(sum(n));
		}
	}
}  