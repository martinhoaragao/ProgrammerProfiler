import java.util.Scanner;
    
/**
 *Escreva um programa Java que dado um número M e um número N, inteiros positivos, lê N idades mostrando 
 *todas as idades maiores que M. No final deve mostrar a média (numero real) das idades lidas.
 */
public class Ex2
{
   public static void main(int n, int m)
   {
       int array[];
       array = new int[n];
       int media = 0;
       int k = 0;
       Scanner s = new Scanner(System.in);
       for(int i = 0; i < n; i++)
       {   
           int f = s.nextInt(); 
           if(f > m) array[k++] = f;
       }
       for(int i = 0; i < k; i++)
           media += array[i];
       media = media / k;
       for(int i = 0; i < k; i++)
            System.out.println(array[i] + " ");
       System.out.println("Média : " + media);
       
   }
}
