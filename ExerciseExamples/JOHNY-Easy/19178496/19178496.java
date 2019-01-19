import java.util.Scanner;

class JOHNY
{
	public static final int MAX_N = 100;
	public static final int[] A = new int[MAX_N + 1];
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args)
	{
		int T, K, N;
		T = scanner.nextInt();

		while (T-- > 0)
		{
			N = scanner.nextInt();
			for (int i = 1; i <= N; A[i++] = scanner.nextInt())
				;
			K = A[scanner.nextInt()];
			int nPos = 1;
			for (int i = 1; i <= N; i++)
			{
				if (A[i] < K)
					nPos++;
			}
			System.out.println(nPos);
		}
		System.exit(0);
	}
}
