import java.util.Scanner;


class Main {
    public static void main(String[] arg) {
        int amount;
        double bankbalance;
        Scanner kb = new Scanner(System.in);
        amount = kb.nextInt();
        double actualbalance = bankbalance = kb.nextDouble();
        bankbalance -= 0.50;
        if(amount%5==0 && amount<=bankbalance) {
            actualbalance = bankbalance - amount;
        }
        System.out.printf("%.2f", actualbalance);
    }
}