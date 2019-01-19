import java.util.*;

class ATM {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int withdrawlAmount = sc.nextInt();
		float initialBalance = sc.nextFloat();
		
		if(withdrawlAmount%5==0&&initialBalance>=(withdrawlAmount+0.5)){
			initialBalance = (float) (initialBalance-(withdrawlAmount+0.5));
		}
		
		System.out.printf("%.2f",initialBalance);
	}
}