import java.util.Scanner;

public class Main
{
	public static void main (String[] args)
	{
		int i = 0;
		Scanner in = new Scanner(System.in);
		while(true){
			i = in.nextInt();
			if(i==42) break;
			System.out.println(i);
		}
	}
}