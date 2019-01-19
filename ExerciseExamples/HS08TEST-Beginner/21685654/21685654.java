import java.util.Scanner;

class Test{
	public static void main(String arg[]){
		double amount=0.0;
		double balance=0.0;
		Scanner scan=new Scanner(System.in);
		amount=scan.nextDouble();
		balance=scan.nextDouble();
		if(amount%5==0&&balance-amount-0.5>0){
			balance=balance-amount-0.50;
		}
		System.out.printf("%.2f",balance);
	}
}