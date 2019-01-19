import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		while(sc.hasNextInt()&&(i=sc.nextInt())!=42) {
			System.out.println(i);			
		}
		sc.close();
	}
}