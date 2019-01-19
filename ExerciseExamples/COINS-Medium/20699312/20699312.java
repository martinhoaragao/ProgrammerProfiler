import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static Map<Long, Long> map = new HashMap<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            long x = sc.nextLong();
            long sum = run(x);
            System.out.println(sum+"");
        }
    }

    private static long run(long x){
        if(map.containsKey(x)){
            return map.get(x);
        }

        long n1 = x / 2;
        long n2 = x / 3;
        long n3 = x / 4;

        long val;
        if(n1 + n2 + n3 > x){
            val = run(n1) + run(n2) + run(n3);
        } else {
            val = x;
        }
        map.put(x, val);
        return val;
    }
}
