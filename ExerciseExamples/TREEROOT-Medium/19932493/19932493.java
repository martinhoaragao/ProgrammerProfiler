import java.util.Scanner;

class TREEROOT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int a = 0, b = 0;
            while (n-- > 0) {
                a += scanner.nextInt();
                b += scanner.nextInt();
            }
            System.out.println(a - b);
        }
    }
}
