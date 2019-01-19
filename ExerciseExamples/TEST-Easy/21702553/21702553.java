import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int test = sc.nextInt();
			if(test != 42) {
				System.out.println(test);
			}
			else {
				break;
			}
			
		}
		sc.close();
	}

}
