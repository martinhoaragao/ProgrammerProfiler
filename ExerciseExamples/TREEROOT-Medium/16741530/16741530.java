import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int root = 0;
            while (n-- > 0) {
                int id = scanner.nextInt();
                int sum = scanner.nextInt();
                root += id - sum;
            }
            System.out.println(root);
        }
    }
 
}