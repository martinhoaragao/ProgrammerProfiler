import java.util.Scanner;
class string
{
	public static void main(String []arg)
	{
		Scanner input=new Scanner(System.in);
			int t=input.nextInt();
			while(t-->0)
			{
				int n=input.nextInt();
				if(n%2==0)
				System.out.println(n);
				else
				System.out.println(n-1);
			}
		input.close();
	}
} 