
import java.util.*;
import java.io.*;

class Main {
    static HashMap<Long,Long> res = new HashMap<>();
    public static void main(String args[]) throws Exception {
        /*Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();*/
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //int t = Integer.parseInt(in.readLine());
        res.put(0l, 0l);
        res.put(1l, 1l);
        res.put(2l, 2l);
        res.put(3l, 3l);
        do {
            System.out.println(getValue(Long.parseLong(in.readLine())));
        } while(in.ready());
    }
    
    static Long getValue(long n) {
        if(res.containsKey(n)) return res.get(n);
        res.put(n, Math.max(n, getValue(n/2) + getValue(n/3) + getValue(n/4)));
        return res.get(n);
    }
}
