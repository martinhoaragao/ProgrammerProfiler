import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			int num = in.nextInt();
			if(num != 42)
				System.out.println(num);
			else
				return;
		}
	}
}