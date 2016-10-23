import java.util.Scanner;
/**
 * Escreva um programa Java que, dado um número inteiro N
 * maior que 0, leia um vector (array unidimensionnal) de N ele-
 * mentos inteiros e imprima quantos valores pares existem no vec-
 * tor.
 */
public class Ex3
{
    public static void main(int n)
    {
        Scanner s = new Scanner(System.in);
        int array[] = new int[n];
        int f, pares, k;
        k = pares = 0;
        for(int i = 0; i < n; i++)
        {
            f = s.nextInt();
            array[k++] = f;
        }
        
        for(int i = 0; i < n; i++)
        {
            if((array[i]%2) == 0) pares++;
        }
        
        System.out.println("Números pares : " + pares);
    }
}
