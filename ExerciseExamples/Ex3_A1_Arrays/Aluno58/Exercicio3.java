
/**
 *   Escreva um programa Java que, dado um número inteiro N
 *   maior que 0, leia um vector (array unidimensionnal) de N elementos
 *   inteiros e imprima quantos valores pares existem no vector.
 */

import java.util.Random;

public class Exercicio3 
{
    private static int[] a;
    
    public static int numerosPares(int n){
        
        Random gerador = new Random();
        int j = 0;
        int count = 0;
        a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = gerador.nextInt(100);
        }
        
        while(j!=n){
            if(a[j] % 2 == 0){
                count++;
            }
            j++;
        }
        return count;
    }
}
