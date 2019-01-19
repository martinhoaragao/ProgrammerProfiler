import java.util.*;
class Easy_1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x;
		int i=0;
		while(true)
		{
			x=sc.nextInt();
			if(x==42)
				break;
			System.out.println(x);
		}
	}
}