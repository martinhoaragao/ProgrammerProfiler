import java.util.*;

public class ex3 {
    
    public static void main(int N, int[] vetor) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < N; i++)
            if (vetor[i] % 2 == 0) count++;
        System.out.println("Quantidade de pares: " + count);
    }
}
