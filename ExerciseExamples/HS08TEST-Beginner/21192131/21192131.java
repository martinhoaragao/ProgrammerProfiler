import java.util.Scanner;
public class Main
{
	public static void main (String[] args)
	{
	    double c = 0.5;
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		double y = in.nextDouble();
		
		if (x >= 0 && x <= 2000 && x % 5 == 0 && y >= 0 && y <= 2000 && (x + c) <= y){
		    System.out.println(y - (x+c));
		}
		else{
		    System.out.println(y);
		}
		
	}
}
