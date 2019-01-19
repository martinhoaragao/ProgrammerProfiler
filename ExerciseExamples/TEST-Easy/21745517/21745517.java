import java.util.Scanner;
class TEST
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		for(;;)
		{
		int x=in.nextInt();
		if(x==42)
		break;
		System.out.println(x);
		}
		
	}
}