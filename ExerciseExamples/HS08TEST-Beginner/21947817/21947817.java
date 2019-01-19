import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int withdrawAmount = scanner.nextInt();
        double balance = scanner.nextDouble();

        if ((withdrawAmount % 5 == 0) && withdrawAmount + 0.50 <= balance) {
            double finalBalance = balance - withdrawAmount - 0.50;
            System.out.printf("%.2f",finalBalance);
        }else {
            System.out.printf("%.2f",balance);
        }

    }
}
