

import java.util.Scanner;

class BytelandianGoldCoins {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            long n = s.nextLong();
            System.out.println(giveMaxCoins(n));
        }
    }

    public static long giveMaxCoins(long n) {
        long ans = n;
        if (ans < n / 2 + n / 3 + n / 4) {
            ans = giveMaxCoins(n / 2) + giveMaxCoins(n / 3) + giveMaxCoins(n / 4);
        }
        return ans;
    }
}
