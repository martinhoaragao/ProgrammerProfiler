import java.util.HashMap;
import java.util.Scanner;

class Coin1 {

    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        HashMap<Long, Long> dp = new HashMap<>();
        while (in.hasNext()){
            long n= in.nextLong();
            System.out.println(get_val(n, dp));
        }
    }

    static long get_val(long n, HashMap<Long, Long> dp){

        if(n<12) {
            return n;
        }
        if (dp.get(n) != null){
            return dp.get(n);
        }
        dp.put(n, Math.max(n, get_val(n/2, dp) + get_val(n/3, dp) + get_val(n/4, dp)));
        return dp.get(n);
    }
}