import java.util.Scanner;
import java.util.ArrayList;

public class Exercicios
{
    /**
     * Escreva um programa Java que, dado um número inteiro N maior que 0, leia um vector (array unidimensionnal) de N elementos inteiros e imprima quantos valores pares existem
     * no vector.
     */
    public static void exercicio3(int N, int[] a){
        int par = 0;
        for (int i = 0; i < N; i++)
            if (a[i]%2 == 0) par++;
        System.out.println("Quantidade de números pares: " + par);
    }
}
