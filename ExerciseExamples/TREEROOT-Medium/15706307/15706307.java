import java.util.Scanner;

/**
 *
 * @author Prince
 */
class RootProblem2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            int n = scanner.nextInt();
            int id = 0, sums = 0;
            for (int j = 0; j < n; j++) {
                id += scanner.nextInt();
                sums += scanner.nextInt();
            }
            System.out.println(Math.abs(id - sums));
        }
    }
}
