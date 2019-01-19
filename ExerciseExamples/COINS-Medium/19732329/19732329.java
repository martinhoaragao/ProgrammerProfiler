import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/***
 Input:
 12
 2

 Output:
 13
 2

 */

class COINS {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = 10;

        long[] a = new long[1000000];

        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        a[4] = 4;

        for (int i = 5; i < a.length; i++) {

            a[i] = Math.max(i, (a[i / 2] + a[i / 3] + a[i / 4]));

        }

        while (scan.hasNext() || T > 0) {

            long n = scan.nextLong();

            long result = 0;
            PriorityQueue<Long> queue = new PriorityQueue<>();

            queue.add(n);

            while (!queue.isEmpty()) {
                long num = queue.remove();
                if (num < a.length)
                    result = result + a[(int) num];
                else {
                    queue.add(num / 2);
                    queue.add(num / 3);
                    queue.add(num / 4);
                }
            }


            System.out.println(result);

            T--;


        }


    }
}
