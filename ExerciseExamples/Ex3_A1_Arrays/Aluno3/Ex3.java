
/**
 * Escreva um programa Java que, dado um número inteiro N
 * maior que 0, leia um vector (array unidimensionnal) de N ele-
 * mentos inteiros e imprima quantos valores pares existem no vec-
 * tor.
 */
import java.util.*;
public class Ex3
{
   public static void main(int N){
    int i, numero;
    int total=0;
    
    Scanner input = new Scanner(System.in);
    List<Integer> numeros = new Vector<Integer>();
    for (i=0; i<N; i++){
        numero=input.nextInt();
        numeros.add(numero);
        if (numero % 2 == 0) total++;
    }
     
 
    System.out.println(total);
   }
    
   
}
