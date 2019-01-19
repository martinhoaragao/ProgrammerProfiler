import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Long, Long> dp = new HashMap<Long, Long>();
        while (in.hasNextInt()) {
            int num = in.nextInt();
            System.out.println(solver((long) num, dp));
        }
    }

    public static long solver(long n, HashMap<Long, Long> dp) {
        if (dp.containsKey(n))
            return dp.get(n);
        if (n == 0 || n == 1)
            return n;
        long ans = solver(n / 2, dp);
        ans += solver(n / 3, dp);
        ans += solver(n / 4, dp);
        ans = Math.max(n, ans);
        dp.put(n, ans);
        return ans;
    }
}