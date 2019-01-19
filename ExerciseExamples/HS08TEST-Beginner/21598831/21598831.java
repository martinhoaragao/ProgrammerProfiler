import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int amountToBeWithdrawn = scanner.nextInt();
        double initialBalance = scanner.nextDouble();

        double finalBalance = 0;

        double amountToBeDeducted =  amountToBeWithdrawn + 0.50;

        if(amountToBeWithdrawn % 5 != 0 || amountToBeDeducted > initialBalance) {
            finalBalance = initialBalance;
        } else {
            finalBalance = initialBalance - amountToBeDeducted;
        }

        System.out.println(String.format("%.2f", finalBalance));

    }
} 
