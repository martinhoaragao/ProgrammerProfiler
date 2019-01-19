import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int T, N, temp, K,song;
        int[] A;
        
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        
        while (T > 0) {
            
            N = sc.nextInt();
            
            A = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                A[i] = sc.nextInt();
            }
            
            K = sc.nextInt();
            song = A[K];
           
            
        
            int i, key, j;
            for (i = 1; i <= N; i++) {
                key = A[i];
                j = i - 1;

                while (j >= 0 && A[j] > key) {
                    A[j + 1] = A[j];
                    j = j - 1;
                }
                A[j + 1] = key;
            }

           
            int p = 1;
            while (p <= N) {
                if (A[p] != song) {
                    p++;
                } else {
                    break;
                }
            }
            System.out.println(p);
            T--;
        }
    }
}
