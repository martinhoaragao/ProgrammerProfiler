import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static HashMap<Long, Long> hashMap = new HashMap<>();

    public static long benefit(long n) {
        if (hashMap.containsKey(n)) {
            return hashMap.get(n);
        }
        
        long answer;

        if ((long) n / 2 + (long) n / 3 + (long) n / 4 > n) {
            answer = benefit((long) n / 2) + benefit((long) n / 3) + benefit((long) n / 4);
            hashMap.put(n, answer);
            return answer;
        } else {
            hashMap.put(n, n);
            return n;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long input;
        // System.out.println((int) 13 / 2);
        while (sc.hasNext()) {
            input = sc.nextLong();
            if (hashMap.containsKey(input)) {
                System.out.println(hashMap.get(input));
            } else {
                System.out.println(benefit(input));
            }
        }
    }
}
