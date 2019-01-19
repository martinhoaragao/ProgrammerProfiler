import java.util.Scanner;


public class Main
{
	public static void main(String args[])
	{
		int tv;
		Scanner sc = new Scanner(System.in);
		while((tv = sc.nextInt())!= 42)
		{
			System.out.println(tv);
		}
		
	}

}