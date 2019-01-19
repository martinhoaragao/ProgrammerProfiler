

import java.util.Scanner;

class HOLES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            System.out.println(holes(s));
        }
    }

    public static int holes(String s) {
        int res = 0;
        for (char c : s.toCharArray()) {
            if (c == 'B')
                res += 2;
            else if (c == 'A' || c == 'D' || c == 'O' || c == 'P' || c == 'R' || c == 'Q')
                res += 1;
        }
        return res;
    }
}
