
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = Integer.parseInt(scan.nextLine());
		int[] numbers = new int[T];
		
		for (int i = 0; i < T; i++) 
			numbers[i] = scan.nextInt();
		
		for (int word : numbers) 
			System.out.println(numbersDouble(word));
	}
	
	public static int numbersDouble(int n) {
		if (n % 2 == 0) return n;
		else return n-1;
	}
}