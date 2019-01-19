import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		
		for(int c = 0; c < cases; c++)
		{
			int[] playlist = new int[scan.nextInt()];
			
			for(int i = 0; i < playlist.length; i++)
				playlist[i] = scan.nextInt();
			
			int johnLength = playlist[scan.nextInt() - 1];
			
			Arrays.sort(playlist);
			
			int newIndex = Arrays.binarySearch(playlist, johnLength);
			
			System.out.println(newIndex + 1);
		}
	}
}
