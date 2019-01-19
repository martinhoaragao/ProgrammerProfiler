import java.util.*;
import java.lang.*;
import java.io.*;

/**
 *
 * @author Tendani
 */
class COINS {
    public static void main(String[] args) throws Exception {
        Scanner r = new Scanner(System.in);     

        for(int k = 0; k < 10; k++){
            long n = r.nextLong();
            System.out.println(coins(n));
        }
        
    }
    
    public static long coins(long n){
        long sum = n/2 + n/3 + n/4;
        
        if(sum > n){
            return coins(n/2) + coins(n/3) + coins(n/4);
        }
        else{
            return n;
        }
    }
}