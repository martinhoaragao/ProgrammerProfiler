package FICHA8;

import java.util.Scanner;

public class Ex2 {
    
    public static void main(int N, int M) {
        
        int idade    = 0;
        double media = 0.0;
        int contador = 0;
        int total    = 0;
        Scanner ler  = new Scanner(System.in);
        
        System.out.println("Digite uma sequência de " + N + " idades!");
        while(contador<N) {
            
            idade = ler.nextInt();
            contador++;
            total+=idade;
            if(idade>M) 
                System.out.println("Idade: " + idade + "\n");
        
        }
        if (contador!=0)
            media = (double)total/(double)contador;
        System.out.println("A média da sequência é " + media + "!\n");
    
    }

}