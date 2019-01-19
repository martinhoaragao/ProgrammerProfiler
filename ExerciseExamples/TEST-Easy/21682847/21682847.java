import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String ar[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		int a;
		a=sc.nextInt();
		while(a!=42)
		{
			System.out.println(a);
			a=sc.nextInt();
		}
	}
}