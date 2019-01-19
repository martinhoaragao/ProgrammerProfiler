import java.util.Scanner;

class Atm {
	
	public static void main(String[] args) {
	
		
		
		double bankCharges=0.50;
		double output=0.00;
		Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
		double balance=sc.nextDouble();
		if(amount%5==0 && balance>amount+bankCharges)
		{
			output=balance-amount-bankCharges;
			System.out.printf("%.2f",output);
		}
		else 
		{
			output=balance;
			System.out.printf("%.2f",output);
		}
		
	}

}
