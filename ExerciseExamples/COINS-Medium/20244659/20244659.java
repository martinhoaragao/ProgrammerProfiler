import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class Test {
    private static Map<Integer, Long> dp = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (long i = 0; i < 10; i++) {
            int s = Integer.parseInt(br.readLine());

            System.out.println(calculateDollars(s));
        }
    }

    private static long calculateDollars(int l) {

        if (l < 12)
            return l;

        if (!dp.containsKey(l)) {
            long cal = calculateDollars(l / 2) + calculateDollars(l / 3) + calculateDollars(l / 4);
            dp.put(l, cal);
            return cal;
        }
        return dp.get(l);
    }
}


