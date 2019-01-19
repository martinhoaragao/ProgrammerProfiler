import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class CodeChef {

    private static HashMap<Long, Long> memoization;

    public static void main(String[] args) throws IOException {
        memoization = new HashMap<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while ((str = bufferedReader.readLine()) != null) {
            long goldCoin = Long.parseLong(str);
            System.out.println(getMaxValue(goldCoin));
        }
        memoization.clear();
    }

    private static Long getMaxValue(long coin) {
        if (memoization.containsKey(coin)) return memoization.get(coin);
        if (coin == 0) return 0L;
        long c1 = Math.max(coin / 2, getMaxValue(coin / 2));
        long c2 = Math.max(coin / 3, getMaxValue(coin / 3));
        long c3 = Math.max(coin / 4, getMaxValue(coin / 4));
        long value = Math.max(coin, c1 + c2 + c3);
        memoization.put(coin, value);
        return value;
    }
}