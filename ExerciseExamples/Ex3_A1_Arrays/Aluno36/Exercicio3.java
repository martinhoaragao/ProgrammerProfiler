
/**
 * Escreva um programa Java que, dado um número inteiro N
 * maior que 0, leia um vector (array unidimensionnal) de N elementos
 * inteiros e imprima quantos valores pares existem no vector.
 */

import java.util.Scanner;

public class Exercicio3{
    private int num;
    private int [] vector; 
    private int li;
    
    public Exercicio3(){
        num = 0;
        li = 0;
    }
    
    public void Exercicio(int n){
        vector = new int[n];
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; (n-i) > 0; i++){
            System.out.print("Introduzir mais " + (n-i) + " valores: ");
            li = input.nextInt();
            vector[i] = li;
            if(li % 2 == 0){
                num++;
            }
        }
        System.out.println("Existem " + num + " números pares.");
    }
}
