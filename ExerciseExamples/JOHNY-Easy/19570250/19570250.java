import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        int t = inputReader.nextInt();
        long[] songs;
        int n, k;
        long value_k;
        while (t > 0) {
            n = inputReader.nextInt();
            songs = new long[n];
            for (int i = 0; i < n; i ++) {
                songs[i] = inputReader.nextLong();
            }
            k = inputReader.nextInt();
            value_k = songs[k - 1];
            Arrays.sort(songs);
            System.out.println(Arrays.binarySearch(songs, value_k) + 1);
            t--;
        }
    }
}