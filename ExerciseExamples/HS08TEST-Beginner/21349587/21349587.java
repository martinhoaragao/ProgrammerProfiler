import java.util.Scanner;

class ATM{
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);

        double withdrawAmt = scn.nextDouble();
        double accountBalance = scn.nextDouble();

        if(withdrawAmt % 5 != 0){
            System.out.println(accountBalance);
        }
        else if(withdrawAmt + 0.50 > accountBalance){
            System.out.println(accountBalance);
        }
        else{
            System.out.println(accountBalance - withdrawAmt - 0.50);
        }

    }

}