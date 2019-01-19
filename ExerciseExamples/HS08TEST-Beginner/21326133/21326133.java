

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int with = input.nextInt();
        double balance = input.nextDouble();
        double result = balance - (with + 0.50);
        if (0 < with && with <= 2000) {
            if (0<=balance && balance<=2000) {
                if (with > 0 && balance >= 0) {
                    if (result > 0 && with % 5.0 == 0) {
                        System.out.println(result);
                    } else {
                        System.out.println(balance);
                    }
                } else {
                    System.out.println(balance);
                }
            }
        }
    }

}
