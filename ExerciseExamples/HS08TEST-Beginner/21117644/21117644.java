import java.util.Scanner;

 class ATM {
    public static void main(String argsp[]) {

        
        Scanner sc = new Scanner(System.in);

        float withdrawalAmt = sc.nextFloat();
        float balance = sc.nextFloat();
        float remainingBal = getBalanceWithdrawal(balance, withdrawalAmt);
        System.out.printf("%.2f", remainingBal);

    }

    private static float getBalanceWithdrawal(float balance, float withdrawalAmt){
        if(withdrawalAmt % 5 != 0 || balance < withdrawalAmt + 0.50f){
            return balance;
        }
        else {
            return balance - withdrawalAmt - 0.50f;
        }
    }
}
