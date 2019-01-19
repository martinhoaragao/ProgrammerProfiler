import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner s;
    static {
        s = new Scanner(System.in);
    }
    public static void main(String[] args) {
        int T;
        T = s.nextInt();
        for (int i = 1; i <= T; i++) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            int n = s.nextInt();
            for (int j = 1; j <= n; j++) {
                arrayList.add(s.nextInt());
            }
            int f = s.nextInt();
            int b = arrayList.get(f-1);
            int ans = 0;
            for (int j = 0; j < n; j++) {
                    if(arrayList.get(j) < b) {
                        ans++;
                    }
            }
            ans++;
            System.out.println(ans);
        }
    }
}
