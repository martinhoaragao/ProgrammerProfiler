import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for (; t > 0; t--)
			System.out.println(solve(in.nextInt()));
	}

	static int solve(int i)
	{
		return (i % 2 == 0) ? i : i-1; 
	}
}