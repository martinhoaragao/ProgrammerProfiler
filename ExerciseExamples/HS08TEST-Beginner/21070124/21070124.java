import java.util.Scanner;
 class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int withdrawlAmount = scanner.nextInt();
		double originalAmount = scanner.nextDouble();
		
		System.out.println(getCurrentBalance(withdrawlAmount, originalAmount));

	}
	
	public static double getCurrentBalance(int withdrawlAmount, double originalAmount) {
		if(withdrawlAmount % 5 == 0) {
			if(originalAmount - 0.50 >= withdrawlAmount ) {
				
				return originalAmount - 0.50 - withdrawlAmount;
			}
			else {
				return originalAmount;
			}
		}
		else {
			return originalAmount;
		}
	}

}