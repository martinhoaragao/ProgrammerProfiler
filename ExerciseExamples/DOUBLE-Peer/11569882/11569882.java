import java.io.*;
import java.util.*;
class chef
{
	public static void main(String args[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T>0)
		{
			T--;
			int N=sc.nextInt();
			if(N%2==1)
			{
				System.out.println(N-1);
			}
			else
			{
				System.out.println(N);
			}
		}
	}
}