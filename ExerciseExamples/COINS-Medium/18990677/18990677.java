import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            long n = sc.nextLong();
            System.out.println(rec(n));
        }
    }

    private static long rec(long n) {
        if (n <= 11) {
            return n;
        }
        return rec(n / 2) + rec(n / 3) + rec(n / 4);
    }
}
