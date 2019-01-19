import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double withdraw = sc.nextFloat();
		double amount = sc.nextFloat();
		double amt = 0;
		if(amount - withdraw - 0.5 >= 0 && withdraw % 5 == 0){
			amt = (float) (amount - withdraw - 0.5);
		}
		else 
			amt = amount;
		System.out.printf("%.2f",amt);
	}
}
			
		