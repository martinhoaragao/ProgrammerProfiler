import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		while(num!=42)
		{
			System.out.println(num);
			num=s.nextInt();
		}
	}
}