import java.util.Scanner;

public class Main{

	public static void main(String[] a) {
	Scanner sc = new Scanner(System.in);
	boolean print = true;
		while(print) {
			int num = sc.nextInt();
			if(num == 42) {
				print = false;	
			}else {
				System.out.println(num);
			}
		}
	}
}