import java.util.Scanner;

/**
 * Created by mehul on 15/5/18.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfCases = sc.nextInt();
        for (int i = 0; i < noOfCases; i++) {
            int remainingId = 0;
            int nodeCount = sc.nextInt();
            for (int i1 = 0; i1 < nodeCount; i1++) {
                remainingId += sc.nextInt() - sc.nextInt();
            }
            System.out.println(remainingId + "");
        }

    }
}