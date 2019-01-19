/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class ByteLandianGoldCoin {
    static HashMap<Long, Long> byte_value = new HashMap<Long, Long>();

    public static long final_dollar_value(long n) {
        if (byte_value.containsKey(n)) {
            return byte_value.get(n);
        }
        long bank_returns = (long) n / 2 + (long) n / 3 + (long) n / 4;

        if (bank_returns > n) {


            Long ans = final_dollar_value((long) n / 2) + final_dollar_value((long) n / 3) + final_dollar_value((long) n / 4);
            byte_value.put(n, ans);
            return ans;

        } else {
            byte_value.put(n, n);
            return n;
        }

    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long input;

        while (sc.hasNext()) {
            input = sc.nextLong();
            if (byte_value.containsKey(input)) {
                System.out.println(byte_value.get(input));
            } else {
                System.out.println(final_dollar_value(input));
            }
        }
    }


}
