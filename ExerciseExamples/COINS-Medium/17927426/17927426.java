import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner scan=new Scanner(System.in);
		int a=0;
		while(a<10)
		{
			long l=scan.nextLong();
			System.out.println(dollar(l));
			a++;
		}
	}
	
	
	public static long dollar(long l)
	{
		if(((l/2)+(l/3)+(l/4))>l)
		{
			return (dollar(l/2)+dollar(l/3)+dollar(l/4));
		}
		return l;
	}
}