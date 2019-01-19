import java.util.*;

class atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float b = sc.nextFloat();
        double c = 0.50;
        if (a % 5 == 0 && b - a >= 0.5) {
            double d = (double) b - a - c;
            String strDouble = String.format("%.2f", d);
            System.out.println(strDouble);
        } else {
            System.out.println(b);
        }
    }
}