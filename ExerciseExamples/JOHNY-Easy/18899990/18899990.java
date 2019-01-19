import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int c=1; c<=t; c++)
		{
			int n = sc.nextInt();
			int[] len = new int[n+1];
			for(int i=1; i<=len.length-1; i++)
			{
				len[i]=sc.nextInt();
			}
			int fSongLen = len[sc.nextInt()];
			int count=0;
			for(int i=1; i<=n; i++)
			{
				if(len[i]<fSongLen)
					count++;
			}
			System.out.println((count+1));
		}
	}
}