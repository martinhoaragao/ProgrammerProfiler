import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String num = scanner.nextLine();
			int n = Integer.parseInt(num);
			if(n == 42) {
				break;
			}
			System.out.println(n);
		}
	}
}
