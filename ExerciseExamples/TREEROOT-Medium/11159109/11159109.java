import java.util.Scanner;

class TreeRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int total = 0;

            for (int j = 0; j < n; j++) {
                total = total + sc.nextInt() - sc.nextInt();
            }

            System.out.println(total);
        }
    }
}
