import java.util.Scanner;

class ATM
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int w = in.nextInt();
		double b = in.nextDouble();
		if(w%5 == 0 && w+0.5 <= b)
			b = b - (w+0.5);
		
		System.out.printf("%.2f",b);
	}
}
