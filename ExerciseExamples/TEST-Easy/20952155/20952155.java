import java.util.*;

public class Main {

	private static Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scan = new Scanner(System.in);
		List<Integer> arr = new ArrayList<Integer>();

		while (scan.hasNextInt()) {
			int x = scan.nextInt();
			arr.add(x);
			if (x == 42) {
				break;
			}
		}

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == 42) {
				break;
			} else {
				System.out.println(arr.get(i));
			}
		}
	}

}
