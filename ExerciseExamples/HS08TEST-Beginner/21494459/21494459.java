
import java.util.Scanner;
class rahulmain {
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		int y = in.nextInt();
		double x= in.nextDouble();
		if (y+0.5 <= x && y%5 == 0)
			x = x - (y + 0.5);
		System.out.printf("%.2f", x);
		}
	
	
		
		
	}
	


