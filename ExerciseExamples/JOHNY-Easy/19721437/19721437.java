/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;
import java.util.Scanner;

 class UncleJonny {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T, N, K;
        T = input.nextInt();
        while (T-- > 0) {
            N = input.nextInt();
            int[] musiclist = new int[N];
            for (int i = 0; i < musiclist.length; i++) {
                musiclist[i] = input.nextInt();

            }
            K = input.nextInt();
            int[] backup = Arrays.copyOf(musiclist, N);
            Arrays.sort(musiclist);
            int n = Arrays.binarySearch(musiclist, backup[K - 1]);
            System.out.println(n + 1);
        }

    }
}
