import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Nandan Mankad on 11/06/18.
 */
class COINS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            while (true) {
                String S = in.nextLine();
                int N = Integer.parseInt(S);
                System.out.println(getAnsRecursively(N, new HashMap<>()));
            }
        } catch (Exception e) {

        }
    }

    public static long getAnsRecursively (int N, Map<Integer, Long> map) {
        if (map.get(N) != null) {
            return map.get(N);
        }
        if (N < (N / 2 + N / 3 + N / 4)) {
            long ans = getAnsRecursively(N / 2, map) + getAnsRecursively(N / 3, map )+  getAnsRecursively(N / 4, map);
            map.put(N, ans);
            return ans;
        } else {
            map.put(N, (long) N);
            return N;
        }
    }

}
