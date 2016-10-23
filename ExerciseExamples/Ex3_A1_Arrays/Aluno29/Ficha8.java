import java.util.Scanner;

public class Ficha8 {
    static Scanner sc = new Scanner (System.in);
    
    public static void ex3 (int N) {
        int i, conta = 0, n;
        int[] vetor;
        vetor = new int[N];
        for (i = 0; i < N; i++) {
            n = sc.nextInt();
            vetor[i] = n;
            if ((n % 2) == 0) {
                conta++;
            }
        }
        
        System.out.println ("O nº de números pares foi " + conta + ".");
        System.out.println ("No array estão os valores: ");
        for (i = 0; i < N; i++) {
            System.out.println (vetor[i]);
        }
    }
}