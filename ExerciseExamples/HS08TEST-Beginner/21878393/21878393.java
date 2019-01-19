import java.util.Scanner;

class Spoj {
    public static void main(String[] arg) {
        int amt;
        double balance;
        Scanner scanner = new Scanner(System.in);
        amt = scanner.nextInt();
        double actualbalance = balance = scanner.nextDouble();
        balance -= 0.50;
        if(amt%5==0 && amt<=balance) {
            actualbalance = balance - amt;
        }
        System.out.printf("%.2f", actualbalance);
    }
}
