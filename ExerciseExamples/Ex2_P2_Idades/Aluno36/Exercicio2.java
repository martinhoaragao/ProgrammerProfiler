
/**
 * Escreva um programa Java que dado um número M e um número
 * N, inteiros positivos, lê N idades mostrando todas as idades
 * maiores que M. No final deve mostrar a média (numero real) das
 * idades lidas.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2{
    //Variávei de Instância
    ArrayList<Integer> maiorIdade;
    int total;
    int li;
    
    public void Exercicio(int n, int m){
        maiorIdade = new ArrayList<Integer>(n);
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; (n - i) > 0; i++){
            System.out.println("Faltam " + (n-i) + " idades: ");
            li = input.nextInt();
            
            if(li > 0){
                total += li;
                
                if(li > m){
                    maiorIdade.add(li);
                    System.out.println("A idade " + maiorIdade.toString() + " é maior do que " + m);
                }
            }
        }
        input.close();
        System.out.println("A média é de " + total/n);
    }
}
