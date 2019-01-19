import java.util.Arrays;
import java.util.Scanner;

class foo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) a[i] = in.nextInt();

            int k = in.nextInt();
            int val = a[k-1];

            Arrays.sort(a);

            for (int i = 0; i < n; i++) {
                if (a[i] == val) {
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}