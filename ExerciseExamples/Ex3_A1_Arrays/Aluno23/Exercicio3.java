

import java.util.Scanner;

public class Exercicio3
{
    public static void main(int N) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira " + N + " inteiros:");
        int[] numeros = new int[N];
        int pares = 0;
        for (int i=0; i < N; i++) {
            numeros[i] = ler.nextInt();
            if (numeros[i]%2 == 0) {
                pares++;
            }
        }
        System.out.println("Existem " + pares + " elementos pares no vetor.");
        
    }
}