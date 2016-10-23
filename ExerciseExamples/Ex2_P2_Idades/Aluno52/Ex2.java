
import java.util.Scanner;
public class Ex2
{
    /**Escreva um programa Java que dado um número M e um nú-
     * mero N, inteiros positivos, lê N idades mostrando todas as idades
     * maiores que M. No final deve mostrar a média (numero real) das
     * idades lidas.
     */
    
    public static void main(int N, int M){
        Scanner in = new Scanner(System.in);
        int idade;
        double media;
        int soma = 0;
        for (int i = 0; i < N; i++){
            idade = in.nextInt();
            if ( idade > M) System.out.println("-> "+ idade+ " maior que " +M);
            soma += idade;
        }
        media = soma/N;
        System.out.println("A media das idades é "+media);
    }
}
