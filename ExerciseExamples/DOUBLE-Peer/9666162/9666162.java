
import java.util.Scanner;

class DoubleStrings {

	public static void main(String[] args) 
	{
		Scanner kbd=new Scanner(System.in);
		int testCases=Integer.parseInt(kbd.nextLine());
		for(int i=0;i<testCases;i++)
		{
			DoubleStrings(Integer.parseInt(kbd.nextLine().trim()));
		}
	}
	public static void DoubleStrings(int n)
	{
		if(n%2==0)
		{
			System.out.println(n);
		}
		else
		{
			System.out.println(n-1);
		}
	}

}
