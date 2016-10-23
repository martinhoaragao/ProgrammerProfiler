package Exercicios;

import static java.lang.Math.pow;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        System.out.println("Insira números inteiros positivos (para terminar insira 0): ");
        int soma = 0, pares = 0, impares = 0, valor = -1;
        double media = 0;
        Scanner s = new Scanner(System.in);

            while( (valor = s.nextInt()) != 0){
                int emLeitura = valor;
                if (emLeitura % 2 == 0){ 
                    pares++;
                    soma += emLeitura;
                    media = soma * pow(pares,-1);
                } else impares++;
            }s.close();
            
        System.out.println("Número de pares inseridos: " + pares);
        System.out.println("Número de ímpares inseridos: " + impares);
        System.out.println("Média dos " + pares + " números pares inseridos: " + media);
    }
}
