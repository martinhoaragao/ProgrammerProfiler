import java.util.*;

class test
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			n=sc.nextInt();
			if(n!=42)
			System.out.println(n);
			else
			break;
		}
	}
}