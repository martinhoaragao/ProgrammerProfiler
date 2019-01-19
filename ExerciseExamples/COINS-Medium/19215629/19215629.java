import java.io.*;
import java.util.*;

class A4{
    static HashMap<Long,Long> map;
    static long best(long n){
        if(n==0)
            return 0;
        if(map.containsKey(n))
            return map.get(n);
        long ans=n;
        if(n/2+n/4+n/3 >=n){
            ans= best(n/2)+best(n/3)+best(n/4);
            map.put(n,ans);
        }
        return ans;
    }
    
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String s = br.readLine();
            if(s==null)
                break;
            map = new HashMap<>();
            long n = Integer.parseInt(s);
           // long ans=n;
            System.out.println(best(n));
        }
    }
}