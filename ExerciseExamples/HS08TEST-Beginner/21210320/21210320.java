

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

        System.out.println(String.format("%.2f",bal));
    }
}
