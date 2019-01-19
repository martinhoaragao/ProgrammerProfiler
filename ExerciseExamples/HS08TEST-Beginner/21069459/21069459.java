import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int widthdraw = sc.nextInt();
        double amount = sc.nextDouble();
        double remain = 0.0;
        if(widthdraw>(int)amount) {
            remain = amount;
        } else if (widthdraw%5 == 0 && widthdraw<(amount-0.5)) {
            remain = amount - (double)widthdraw - 0.5;
        } else {
            remain = amount;
        }
        System.out.printf("%.2f",remain);
    }
}
