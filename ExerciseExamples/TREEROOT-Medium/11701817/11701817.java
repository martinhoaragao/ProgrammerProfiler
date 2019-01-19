import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int N = in.nextInt();
            int root = 0;
            for (int i = 0; i < N; i ++) {
                int id = in.nextInt();
                int sum = in.nextInt();
                root += id - sum;
            }
            System.out.println(root);
        }
    }
}