import java.util.*;

class DoubleStr
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the number of test cases");
		int x=sc.nextInt();

		for(int i=0;i<x;i++)
		{
			//System.out.println("Enter the length of String");
			int a=sc.nextInt();

			if(a%2==0)
			{
				System.out.println(a);
			}
			else
			{
				System.out.println(a-1);
			}
		}
	}
}