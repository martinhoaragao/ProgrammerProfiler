package Exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        int pares = 0, i = 0, k = 0;
        System.out.println("Quantos números inteiros pretende inserir?");
        Scanner s = new Scanner(System.in);
        int n = (s.hasNextInt()) ? s.nextInt() : 0;
        int[] numeros = new int[n];
        System.out.println("Insira " + n + " números inteiros.");
        
        for(i = 0; i < n && s.hasNextInt(); i++){
            int emLeitura = s.nextInt(); 
            numeros[i] = emLeitura;
            if (emLeitura % 2 == 0) pares++;
        }s.close();
        
        System.out.print("Foram inseridos " + pares + " números pares no array de inteiros [");
        
        for(k = 0; k < i; k++)
            System.out.print(numeros[k] + "; ");
     
        System.out.println("]");
    }
}
