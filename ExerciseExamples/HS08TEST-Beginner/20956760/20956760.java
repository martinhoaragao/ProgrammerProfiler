
import java.io.*;

import java.util.Scanner;


class ATM {
	

public static void main (String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	double amount_to_withdraw = sc.nextDouble();
	
	double balance_available = sc.nextDouble();
		if(amount_to_withdraw%5==0 && (amount_to_withdraw+0.5)<=balance_available ){
	
   System.out.printf("%.2f\n",balance_available-amount_to_withdraw-0.50);
	

}
else
{
	
	
    System.out.printf("%.2f\n",balance_available);
		}
	}
}