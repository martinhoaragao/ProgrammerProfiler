import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int WithdramNumber = input.nextInt();
        double AccBalance = input.nextDouble();
        double AccBalanceT = AccBalance-0.5;

        if (WithdramNumber % 5 == 0) {
            if (WithdramNumber < AccBalanceT) {
                AccBalance = AccBalance - WithdramNumber - 0.50;

            } else {
            }
        }
        System.out.printf("%.2f\n" ,AccBalance);
    }

}
