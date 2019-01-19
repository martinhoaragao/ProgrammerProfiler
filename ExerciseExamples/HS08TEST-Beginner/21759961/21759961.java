import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    private static float initialBalance, withdrawalAmount;

    public static void main(String[] args) {

        withdrawalAmount = scanner.nextFloat();
        initialBalance = scanner.nextFloat();

        if(withdrawalAmount> 0 && withdrawalAmount< 2000 && initialBalance >0 && initialBalance <2000) {
            if(withdrawalAmount%5==0 && (initialBalance - withdrawalAmount - 0.50)>0) {
                System.out.println((initialBalance - withdrawalAmount - 0.50));
            }
            else {
                System.out.println(initialBalance);
            }
        }



    }
}
