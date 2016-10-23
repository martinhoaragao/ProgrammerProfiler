
/**
 *  Escreva um programa Java que leia uma quantidade não determinada de números inteiros positivos
 *  (o número que encerrará a leitura será o zero). Calcule e imprima a quantidade de números pares
 *  e ímpares assim como a média (numero real) dos valores pares.
 * 
 */

import java.util.Scanner;

public class Exercicio1 {
  

    public static void exercicio1() {
        Scanner s = new Scanner(System.in); //para ler do teclado
        int x;
        int somatorio = 0;
        int nPares = 0;
        int nImpares = 0;
        double media; 
        
        System.out.print("Introduza um inteiro positivo ou zero para terminar: ");
        x = s.nextInt();
  
        while(x != 0){
            
            somatorio += x;
            
            if(x%2 == 0) nPares++;
            else nImpares++;
            
            System.out.print("Introduza um inteiro positivo ou zero para terminar: ");
            x = s.nextInt();
    
        }
        
        media = (double) somatorio/(nPares + nImpares);
        
        System.out.println("A quantidade de número pares: " + nPares);
        System.out.println("A quantidade de número impares: " + nImpares);
        System.out.println("Média: " + media+"\n");
    }
}
