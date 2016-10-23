

import java.util.Scanner;

public class Exercicio2
{
    public static void main(int N, int M) {
        Scanner ler = new Scanner(System.in);
        int[] idades = new int[N];
        
        System.out.println("Insira " + N + " idades:");
        for (int i=0; i < N; i++) {
            idades[i] = ler.nextInt();
        }
        
        System.out.println("Idades inseridas maiores do que " + M + ":");
        double media = 0;
        for (int i=0; i < N; i++) {
            media += idades[i];
            if (idades[i] > M)
                System.out.println(idades[i]);
        }
        
        media = media / idades.length;
        System.out.println("Média das idades: " + media);
    }
}