import java.util.Scanner;


class DoubleString {
	
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		while(testCases != 0)
		{
			int number = in.nextInt();
			if(number % 2 == 0)
				System.out.println(number);
			else
				System.out.println(number -1);
			testCases--;
		}
	}
}
