
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		int x = 0;
		float y = 0;
		Scanner sc = new Scanner(System.in);
		
		
		x = sc.nextInt();
		
		y = sc.nextFloat();
		
		if (x>0 && y<=2000 && x<= 2000 &&  y>=0 ) {
			if (x%5 == 0 && ((float) x + 0.5) < y) {
				y = (float) (y - ((float) x + 0.5));
				System.out.printf("%.2f\n", y);
			
			}else {
				System.out.printf("%.2f\n", y);
			}
		}
	}
}
