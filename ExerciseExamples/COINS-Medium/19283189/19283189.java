//import java.io.*;
import java.util.*;
public class Main {
static HashMap<Long,Long> mp=new HashMap<Long,Long>();
    public static void main(String args[]) {
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Scanner sc = new Scanner(System.in);
 
        long n;
        while (sc.hasNextLong()){
            n = Long.parseLong(sc.nextLine());
            System.out.println(sum(n));
        }
        //System.out.print(ans);
    }
    static long sum(long n)
    {
        if(n<12)
        return n;
        
        if(mp.containsKey(n))
        return mp.get(n);
        long maxc=Math.max(n,sum(n/2)+sum(n/3)+sum(n/4));
        mp.put(n,maxc);
        return mp.get(n);
    }
}
