import java.util.Scanner;

/**
 * Pooja would like to withdraw X $US from an ATM. The cash machine will only 
 * accept the transaction if X is a multiple of 5, and Pooja's account balance has enough 
 * cash to perform the withdrawal transaction (including bank charges). For each successful withdrawal the bank charges 0.50 $US. Calculate Pooja's account balance
 *  after an attempted transaction.
 * @author key
 *
 */
class ATM {
	
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt();
		double y=sc.nextDouble();
		if(x%5!=0 || x+0.50>y) {
			System.out.println(String.format("%.2f",y));
		}else {
			System.out.println(String.format("%.2f",y-(x+0.5)));
		}
		
	}

}
