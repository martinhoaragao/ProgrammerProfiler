
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ncasos = input.nextInt();
        int[] casos = new int[ncasos];
        for (int i = 0; i < ncasos; i++) {
            casos[i] = input.nextInt();
        }
        for (int i = 0; i < ncasos; i++) {
            if (casos[i] % 2 == 0) {
                System.out.println(casos[i]);
            } else {
                System.out.println(casos[i] - 1);
            }
        }
    }
    
}
