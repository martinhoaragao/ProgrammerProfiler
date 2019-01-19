
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

class COINS {
    public static void main(String args[]) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0;i<10;++i){
            solve(reader.readLine());
        }
    }

    private static void solve(String s) {
        int v = Integer.parseInt(s);
        HashMap<Long, Long> hashMap = new HashMap<>();
        //solveUtil(v, hashMap);
        System.out.println(solveUtil(v,hashMap));
    }

    private static long solveUtil(long v, HashMap<Long, Long> hashMap) {
        if (v < 5) {
            return v;
        }
        if (hashMap.get(v) != null) {
            return hashMap.get(v);
        }
        long a = Math.max(v, solveUtil(v / 2, hashMap) + solveUtil(v / 3, hashMap) + solveUtil(v / 4, hashMap));
        hashMap.put(v, a);
        return a;
    }

}
