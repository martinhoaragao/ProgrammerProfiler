import java.util.Scanner;

/**
 * https://www.codechef.com/problems/TREEROOT
 * 
 * @author harish.sharma
 *
 */
class TreeRoot {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int c1 = 0, c2 = 0;
            for (int j = 0; j < n; j++) {
                c1 += in.nextInt();
                c2 += in.nextInt();
            }
            System.out.println(c1 - c2);
        }
        in.close();
    }
}
