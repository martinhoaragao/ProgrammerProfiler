import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++)
		{
			int N = sc.nextInt();
			int nodeSum = 0;
			int childSum = 0;
			for (int j = 0; j < N; j++)
			{
				nodeSum += sc.nextInt();
				childSum += sc.nextInt();
			}
			System.out.println(nodeSum - childSum);
		}
	}

}
