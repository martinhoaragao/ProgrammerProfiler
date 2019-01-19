

import java.util.*;

 class ATM {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double tax = 0.50;
		int withdraw = s.nextInt();
		double balance = s.nextDouble();
		if((withdraw%5==0)&&(balance>(withdraw+tax))) {
			
				balance = balance - (withdraw+tax);
		}
		
		System.out.printf("%.2f",balance);
		
	}

}
