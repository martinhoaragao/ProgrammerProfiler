import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test;
		while(true) {
			test = sc.nextInt();
			if(test != 42) {
				System.out.println(test);
			}
			else {
				break;
			}
		}
	}
}
