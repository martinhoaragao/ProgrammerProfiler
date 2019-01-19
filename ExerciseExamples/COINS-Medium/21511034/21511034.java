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
                System.out.println(getAnsRecursively(N));
            }
        } catch (Exception e) {

        }
    }

    public static long getAnsRecursively (int N) {
        if (N < (N / 2 + N / 3 + N / 4)) {
            return getAnsRecursively(N / 2) + getAnsRecursively(N / 3 )+  getAnsRecursively(N / 4);
        } else {
            return N;
        }
    }

}