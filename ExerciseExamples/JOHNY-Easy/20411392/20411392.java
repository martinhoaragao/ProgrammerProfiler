

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; ++i) {
                a[i] = sc.nextInt();
            }

            int x = sc.nextInt();
            x = a[x - 1];
            Arrays.sort(a);
            System.out.println(Arrays.binarySearch(a, x) + 1);
        }
    }

    private static void print(TreeSet l1) {
        Iterator it = l1.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}
