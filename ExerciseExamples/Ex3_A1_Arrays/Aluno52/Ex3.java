
import java.util.ArrayList;
import java.util.Scanner;
public class Ex3
{
    /**
     *      Escreva um programa Java que, dado um número inteiro N
     * maior que 0, leia um vector (array unidimensionnal) de N elementos
     * inteiros e imprima quantos valores pares existem no vector
     */
    
    public static void main(int N){
        ArrayList<Integer> vetor = new ArrayList<>(N);
        Scanner in = new Scanner(System.in);
        System.out.println("Insira "+N+" elementos: ");
        int pares = 0;
        for(int i = 0; i < N; i++){
            int novo = in.nextInt();
            vetor.add(novo);
            if (novo%2==0) pares++;
        }
        
        System.out.println("Foram inseridos "+pares+" números pares.");
    }
}
