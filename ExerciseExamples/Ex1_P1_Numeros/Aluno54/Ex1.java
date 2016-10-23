package FICHA8;

import java.util.Scanner;

public class Ex1 {
    
    public static void main(String[] args) {
        
        int numero   = 1;
        int par      = 0;
        int impar    = 0;
        int total    = 0;
        double media = 0.0; 
        int contador = 0;
        Scanner ler  = new Scanner(System.in);
        
        System.out.println("Digite uma sequência de números terminada em zero:");
        while(numero!=0) {
            
            numero = ler.nextInt();
            if (numero!=0) {
                if (numero%2==0) {
                    par++;
                    contador++;
                    total += numero;
                }
                else { 
                    impar++;
                    contador++;
                    total += numero;
                }
            }
        
        }
        if (contador!=0)
            media = (double)total/(double)contador;
        System.out.println("\nForam inseridos " + par + " números pares!");
        System.out.println("Foram inseridos " + impar + " números ímpares!");
        System.out.println("\nA média da sequência é "+ media + "!\n");
        
    }
    
}
