import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numCases, numNodes, solution;
        Scanner scanner;

        scanner = new Scanner(System.in);
        numCases = scanner.nextInt();
        for (int numCase = 0; numCase < numCases; numCase++) {
            solution = 0;
            numNodes = scanner.nextInt();
            for (int numNode = 0; numNode < numNodes; numNode++) {
                solution += scanner.nextInt();
                solution -= scanner.nextInt();
            }

            System.out.println(solution);
        }
    }
}
