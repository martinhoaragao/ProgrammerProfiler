import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Rahul Chaudhary
 */class Bytelandian_gold_coins 
{
    static Map<Long ,Long> h = new HashMap<>();
    static long coin(long n)
    {
        if (n < 12)
            return n;
        
        if (h.containsKey(n))
        {
            return h.get(n);
            
        }
        long r = coin(n/2)+coin(n/3)+coin(n/4);   
            h.put(n,r);
            return r;
        
        
    }
    public static void main(String args[] ) throws Exception
    {
        Scanner in = new Scanner(System.in);
     
        for (int z = 0; z < 10 ; z++) 
        {
            
            long n = in.nextLong();
            System.out.println(coin(n));
            h.clear();
        }
    }
}
