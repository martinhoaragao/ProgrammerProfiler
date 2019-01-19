import java.util.Arrays;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int TN[] = new int[T];
		int TA[][] = new int[T][];
		int TK[] = new int[T];
		for (int i = 0;
				i < T;
				i++)
		{
			TN[i] = sc.nextInt();
			TA[i] = new int[TN[i]];
			for (int j = 0;
					j < TN[i];
					j++)
			{
				TA[i][j] = sc.nextInt();
			}
			TK[i] = sc.nextInt();
		}

		for (int i = 0;
				i < T;
				i++)
		{
			int uj = TA[i][TK[i] - 1];
			Arrays.sort(TA[i]);
			for (int j = 0; j < TA[i].length; j++)
			{
				if (uj == TA[i][j])
				{
					System.out.println(j + 1);
				}
			}
		}
	}
}
