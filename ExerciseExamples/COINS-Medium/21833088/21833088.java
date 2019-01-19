import java.util.*;
import java.io.*;
public class Main {
    static HashMap<Long,Long> dp = new HashMap<>();
    private static long getCoins(long n){
        if(dp.containsKey(n))
            return dp.get(n);
        else{
            long val = getCoins(n/2)+getCoins(n/3)+getCoins(n/4);
            dp.put(n,Math.max(n,val));
            return dp.get(n);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for(long i=0;i<12;++i)
            dp.put(i,i);
         while(in.hasNext()){
            long n = in.nextLong();
            System.out.println(getCoins(n));
         }
    }
}
