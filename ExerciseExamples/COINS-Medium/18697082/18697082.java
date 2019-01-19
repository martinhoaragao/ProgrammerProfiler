import java.util.*;
import java.io.*;

public class Main {

    private static Map<Long, Long> dp = new HashMap<>();

    private static long maximize(long n) {
        if (n <= 1) {
            return n;
        }
        if (dp.containsKey(n)) {
            return dp.get(n);
        }
        long answer = Math.max(n, maximize(n / 2) + maximize(n / 3) + maximize(n / 4));
        dp.put(n, answer);
        return answer;
    }

    public static void main(final String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            long n = in.nextLong();
            System.out.println(maximize(n));
        }
    }

}
