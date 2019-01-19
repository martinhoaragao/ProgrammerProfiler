import java.util.Scanner;

class ATMProblemCodeHS08TEST{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int withdrawAmount;
		double accountBalance;

		withdrawAmount = sc.nextInt();
		accountBalance = sc.nextDouble();

		if(withdrawAmount+0.5<=accountBalance && withdrawAmount%5==0){
            accountBalance -= withdrawAmount + 0.5;
        }

        System.out.println(String.format("%.2f",accountBalance));

	}

}