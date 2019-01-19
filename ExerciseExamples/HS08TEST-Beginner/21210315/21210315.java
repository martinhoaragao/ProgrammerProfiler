

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double bal = scanner.nextDouble();



        if(a+0.5<=bal && a%5==0){
            bal = bal - a - 0.5;
        }

        DecimalFormat dec = new DecimalFormat("#0.00");
        System.out.println(dec.format(bal));


    }
}
