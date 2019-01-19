import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int withdraw = sc.nextInt();
		double balance = sc.nextDouble();
		
		if(withdraw % 5 == 0 && balance >= ((double)withdraw + 0.5)){
			System.out.printf("%.2f", (balance - withdraw-0.5));
		}
		else
			System.out.printf("%.2f", balance);
	}

}
