import java.util.Scanner;

class ATM {
    public static final double BANK_CHARGES = 0.5;
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        
        double amount = stdin.nextDouble();
        double balance = stdin.nextDouble();

        stdin.close();

        if (amount % 5 != 0) {
            //invalid withdrawal amount
            System.out.println(balance);
        } else if (amount + BANK_CHARGES > balance) {
            //not enough balance
            System.out.println(balance);
        } else {
            System.out.println(balance - amount - BANK_CHARGES);
        }
    }
}