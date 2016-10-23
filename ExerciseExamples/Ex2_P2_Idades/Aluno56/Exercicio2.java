package Exercicios;

import static java.lang.Math.pow;
import java.util.Scanner;


public class Exercicio2 {
    public static void main(String[] args){
        int m = 0, n = 0, j = 0, i = 0, k = 0, soma = 0;
        double media = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Insira um número inteiro positivo (M): ");
        m = (s.hasNextInt()) ? s.nextInt() : 0;
        System.out.println("Insira o número de idades que pretende inserir (N): ");
        n = (s.hasNextInt()) ? s.nextInt() : 0;
        System.out.println("Insira as " + n + " idades: ");
        int[] numerosLidos = new int[n];
        int[] maioresQueM = new int[n];
        
        for(; i < n && s.hasNextInt(); i++){
            int emLeitura = s.nextInt();
            numerosLidos[i] = emLeitura;
            soma += emLeitura;
            if (emLeitura > m){maioresQueM[j] = emLeitura; j++;}
        }media = soma * pow(n,-1); s.close();
        
        System.out.println("\nA média das " + n + "(N) idades inseridas é de " + media);
        System.out.print("Idades maiores do que " + m + "(M): ");
        
        for(k = 0; k < j; k++){
            System.out.print(maioresQueM[k] + "; ");
        }
    }
}
