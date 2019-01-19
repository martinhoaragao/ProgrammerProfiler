import java.util.Scanner;
class ATMTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int withdrawAmount = sc.nextInt();
		float totalAmount = sc.nextFloat();
		if( withdrawAmount < (totalAmount - 0.5)){
			if( withdrawAmount % 5 == 0 ){
				System.out.println(String.format("%.2f", totalAmount - withdrawAmount - 0.5));
				sc.close();
				return;
			}
		}
		System.out.println(String.format("%.2f", totalAmount));
		sc.close();

	}

}
