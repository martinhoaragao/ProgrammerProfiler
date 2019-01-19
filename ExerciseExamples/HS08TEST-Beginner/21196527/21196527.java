import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int input;
        double balance;

        input = s.nextInt();
        balance = s.nextDouble();
        s.close();

        
            if ((input+0.5) > balance) {
                System.out.printf("%.2f", balance);
            } else if (input % 5 != 0) {
                System.out.printf("%.2f", balance);
            } else {
                System.out.printf("%.2f", (balance - (double) input - 0.50));
            }
        
                  
    }
}