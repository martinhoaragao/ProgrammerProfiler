import java.util.Scanner;

class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wa = scanner.nextInt();
        float ia = scanner.nextFloat();
        if ((0 < wa && wa <= 2000) && (0 <= wa && ia <= 2000)) {
            if ((wa % 5 != 0) || ((wa + 0.50)) > ia) {
                System.out.format("%.2f", ia);
            } else {
                System.out.format("%.2f", (ia - 0.50) - wa);
            }
        }
    }
}
