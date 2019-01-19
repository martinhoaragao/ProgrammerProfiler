import java.util.*;

class DoubleString
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
	for(int i=0;i<num;i++)
	{
		long x=sc.nextLong();
		if(x%2==0)
		System.out.println(x);
		else
		System.out.println(x-1);
	}
	}
}