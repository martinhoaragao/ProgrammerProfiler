import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
        public static void main (String[] args) {

            int t=10;
            while (t-->0) {
                long n = sc.nextLong();
                System.out.println(americanDollar(n));
            }
        }

        static long americanDollar(long n) {
            long sum = n / 2 + n / 3 + n / 4;
            if (sum > n) {
                return americanDollar(n/2) + americanDollar(n/3) + americanDollar(n/4);
            }
            return n;
        }
}