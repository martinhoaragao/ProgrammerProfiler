import java.io.*;
import java.util.*;
public class Main {

    // Used to memorize intermediate results by the DP approach
    private static Map<Integer, Long> table = new HashMap<Integer, Long>();

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            out.println(maxDollars(n));
        }
        out.flush();
    }

    /**
     * Find the maximum dollars one can make from a coin.
     * @param n The value of the coin.
     * @return The maximum dollars made from a coin of value n.
     */
    public static long maxDollars(int n) {
        if (n < 12)
            return n;
        if (table.containsKey(n))
            return table.get(n);

        // Take the optimal strategy by exchanging with the bank.
        // int type is not sufficient to hold the result when n is large.
        long maxDollarsOfNCoins = maxDollars(n/2)+maxDollars(n/3)+maxDollars(n/4);

        // Save the result to avoid duplicate computation
        table.put(n, maxDollarsOfNCoins);

        return maxDollarsOfNCoins;
    }
}
