import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double init, withdraw;
        String[] ip = scanner.nextLine().split(" ");
        withdraw = Double.parseDouble(ip[0]);
        init = Double.parseDouble(ip[1]);
        if (withdraw % 5 == 0 && withdraw <= init - 0.50) {
            System.out.printf("%.2f", init - withdraw - 0.5);
        } else {
            System.out.printf("%.2f", init);
        }
    }
}
