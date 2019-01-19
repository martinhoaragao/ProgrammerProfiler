import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Main {
    private static Map<Long, Long> table = new HashMap<Long, Long>();
 
    public static long coins(long n){
        if(n < 12){
            return n;
        }
 
        if(table.containsKey(n)){
            return table.get(n);
        }
 
        long maxCoins = Math.max(n, coins(n/2) + coins(n/3) + coins(n/4));
 
        table.put(n, maxCoins);
        return maxCoins;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        long n;
        while (sc.hasNextLong()){
            n = Long.parseLong(sc.nextLine());
            System.out.println(coins(n));
        }
    }
}
 