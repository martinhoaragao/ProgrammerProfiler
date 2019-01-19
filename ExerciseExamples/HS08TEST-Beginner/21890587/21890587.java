import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner kb = new Scanner(System.in);
        double bankbalance;
        int amount = kb.nextInt();
        double actualbalance = bankbalance = kb.nextDouble();
        bankbalance -= 0.50;
        if(amount%5==0 && amount<=bankbalance) {
            actualbalance = bankbalance - amount;
        }
        System.out.printf("%.2f", actualbalance);
    }
}