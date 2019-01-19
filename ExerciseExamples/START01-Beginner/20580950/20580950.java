import java.util.Scanner;

class Test
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		long num=(long)sc.nextInt();
		if(num>=0 && num<=100000)
			System.out.print(num);
	}
}