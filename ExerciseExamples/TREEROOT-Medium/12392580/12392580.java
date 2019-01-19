import java.util.Scanner;

/**
 * Created by techmint on 1/1/17.
 */
public class Main{
    public static void main(String[] args) {
        root();
    }

    public static void root() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int root = 0;
            for (int i = 0; i < n; i++) {
                int id = sc.nextInt();
                int sum = sc.nextInt();
                root += id - sum;
            }
            System.out.println(root);
        }
    }
}
