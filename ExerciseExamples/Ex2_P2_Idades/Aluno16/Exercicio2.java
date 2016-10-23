
/**
 * Escreva um programa Java que dado um número M e um número N, inteiros positivos,
 * lê N idades mostrando todas as idades maiores que M. No final deve mostrar a média (numero real)
 * das idades lidas
 */

import java.util.Scanner;

public class Exercicio2 {
    
    public static void exercicio2 (int m, int n){
        
        int soma = 0;
        double media;
        Scanner s = new Scanner(System.in);
        int x;
        int nIdades = 0;
       
        
        for(int i = 0; i < n ; i++){
            System.out.print("Introduza uma idade: ");
            x = s.nextInt();
            
            soma += x;
            nIdades++;
            
            if( x > m){
                System.out.println("A idade "+ x + " inserida é maior que " + m + "!" );
            }
            
        }  
       
   
        media = (soma*1.0)/nIdades;
        
        System.out.println("Média de idades: " + media);
        
    }
    

   
}
