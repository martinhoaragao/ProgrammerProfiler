import java.util.Scanner;

/**
 * Created by tahmid on 3/9/17.
 */
public class Main {
    public static void main(String[] args) {

        Scanner ana = new Scanner(System.in);
        int test = ana.nextInt();
        for (int tc = 0; tc < test; tc++) {
            int n = ana.nextInt();
            int root = 0;
            for (int i = 0; i < n; i++) {
                int node = ana.nextInt();
                int sum = ana.nextInt();
                root += node - sum;
            }
            System.out.println(root);
        }
    }
}