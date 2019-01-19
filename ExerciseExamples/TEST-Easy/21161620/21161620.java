import java.util.ArrayList;
import java.util.Scanner;

class BreatAt42 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> validInputs = new ArrayList<>();
		while (true) {
			int input = sc.nextInt();
			if (input == 42)
				break;
			else
				validInputs.add(input);
		}
		for (Integer integer : validInputs) {
			System.out.println(integer);
		}
	}

}