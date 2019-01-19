import java.util.Scanner;

class RestrictInput
{
	public static void  main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			int j=sc.nextInt();
			if(j==42)
			   break;
			else
			System.out.println(j);
		}
	}
}