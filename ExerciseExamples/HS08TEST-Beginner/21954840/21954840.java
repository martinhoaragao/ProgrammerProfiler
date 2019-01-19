import java.util.*;

class main {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double withdraw = scan.nextDouble();
		double balance = scan.nextDouble();

		if (withdraw + .5 > balance )
			System.out.printf("%.2f",balance);
		else if (withdraw % 5 == 0)
			System.out.printf("%.2f",balance - withdraw - .5);
		else
			System.out.printf("%.2f",balance);
	}

}

