import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while (num-- > 0) {
			int len = Integer.parseInt(sc.next());
			int[] elem = new int[len];
			for (int i = 0; i < len; i++)
				elem[i] = Integer.parseInt(sc.next());
			int item = elem[Integer.parseInt(sc.next()) - 1];
			Arrays.sort(elem);
			for (int i = 0; i < len; i++) {
				if (elem[i] == item)
					System.out.println(i + 1);
			}
		}
		sc.close();
	}

}
