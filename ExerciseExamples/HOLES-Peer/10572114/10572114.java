import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int[] holes = {1,2,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0};
		int t = scan.nextInt();
		for (int i = 0; i < t; i++)
		{
			String line = scan.next();
			int total = 0;
			for (int j = 0; j < line.length(); j++)
				total += holes[line.charAt(j)-'A'];
			System.out.println(total);
		}
	}
}
