package ficha8;

import java.util.Scanner;

public class Ficha8 {
    
    public static void exercicio3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamanho do vetor: ");
        int tamanho = sc.nextInt(), i = 0, pares = 0;
        if(tamanho > 0) {
            int[] vetor = new int[tamanho];
        
            while(i < tamanho) {
                vetor[i] = sc.nextInt();
                if(vetor[i] % 2 == 0) pares++;
                i++;
            }
        }
        System.out.println("Existem " + pares + " pares.");
    }
}