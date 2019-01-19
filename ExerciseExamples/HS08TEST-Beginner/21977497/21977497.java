import java.util.Scanner;
public class Main {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[]args) {
			int x = scanner.nextInt();
			double y = scanner.nextDouble();
			if(x % 5 == 0 && x+0.5 <= y) {
				y -= x+0.5;
			}
			System.out.printf("%.2f\n",y);
		
		scanner.close();
	}
}
