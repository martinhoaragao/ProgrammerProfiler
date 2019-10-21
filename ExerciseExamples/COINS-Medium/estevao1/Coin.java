import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Coin {
    public static Map<Long,Long> calculus;

    private static long getmax(long x) {
        if(x <= 10) {
            return x;
        } else if(Coin.calculus.containsKey(x)) {
            return Coin.calculus.get(x);
        } else {
            long est =  getmax(x/2) + getmax(x/3) + getmax(x/4);
            Coin.calculus.put(x, Math.max(x, est));
            return Coin.calculus.get(x);
        }
    }

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        Coin.calculus = new HashMap<>();

        while(in.hasNextLong()) {
            long value = in.nextLong();
            System.out.println(getmax(value));
        }
    }
}