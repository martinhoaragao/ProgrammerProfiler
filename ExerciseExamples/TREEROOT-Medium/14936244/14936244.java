import java.math.BigInteger;
import java.util.Scanner;

class CodeChef
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int T = input.nextInt();

		for (int i = 0; i < T; i++)
		{
			int N = input.nextInt();

			int sumID = 0;
			int count = 0;

			for (int j = 0; j < N; j++)
			{
				sumID += input.nextInt();
				count += input.nextInt();
			}
			System.out.println(sumID - count);

		}
	}
}