import java.util.*;
import java.io.*;
public class Main {
    private static long getCoins(long n){
        if(n<12) return n;
        else{
            long val = getCoins(n/2)+getCoins(n/3)+getCoins(n/4);
            return Math.max(n,val);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         while(in.hasNext()){
             long n = in.nextLong();
             System.out.println(getCoins(n));
         }
    }
}
