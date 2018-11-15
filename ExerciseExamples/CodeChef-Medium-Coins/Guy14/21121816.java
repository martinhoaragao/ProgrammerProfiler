
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author mithbose
 */
public class Main {

    static Map<Long, Long> resultMap;

    public static void main(String[] args) throws IOException {
        resultMap = new HashMap<>();
        resultMap.put(0L, 0L);
        Scanner s = new Scanner(System.in);
        for (int t = 10; t > 0; t--) {
            long n = s.nextLong();
            System.out.println(compute(n));
        }
    }

    private static long compute(long n) {
        if (resultMap.containsKey(n)) {
            return resultMap.get(n);
        }
        long val = compute(n / 2) + compute(n / 3) + compute(n / 4);
        resultMap.put(n, Math.max(n, val));
        return Math.max(n, val);
    }

}
