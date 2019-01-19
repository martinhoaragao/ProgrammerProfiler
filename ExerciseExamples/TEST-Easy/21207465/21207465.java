import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean done = false;
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		while(!done) {
			int n = scanner.nextInt();
			if(n != 42) {
			numbers.add(n);
			} else {
				done = true;
			}
			
			
		}
		for(int i =  0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
	}
}
