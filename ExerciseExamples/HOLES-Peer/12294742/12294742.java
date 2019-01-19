import java.util.*;

class Solution
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int[] holes = {1,2,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0};
		int T = in.nextInt();
		while (T-- > 0)
		{
			String text = in.next();
			int count = 0;
			int length = text.length();
			for (int i=0; i<length; i++)
				count += holes[text.charAt(i)-65];
			System.out.println(count);
		}
		in.close();
	}
}