import java.util.Scanner;
import java.util.ArrayList;

public class Exercicios
{
    /**
      * Escreva um programa Java que dado um número M e um número N, inteiros positivos, lê N idades mostrando todas as idades maiores que M. No final deve mostrar a média (numero
      * real) das idades lidas.
      */
    public static void exercicio2(int M, int N){
        ArrayList<Integer> list = new ArrayList<Integer>();
        double media, soma = 0;
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            System.out.println("Insira uma idade:");
            int n = ler.nextInt();
            if (n >= 0) {
                soma += n;
                if (n > M)
                    list.add(n);
            }
            else System.out.print("Número inválido. ");
        }
        media = soma / N;
        System.out.println("Idades maiores que " + M + ": " + list + "\nMédia das idades lidas: " + media);
    }
}
