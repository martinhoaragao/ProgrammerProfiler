

import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio1
{
    public static void main() {
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        
        System.out.println("Insira números positivos (ou 0 para terminar):");
        int num = ler.nextInt();
        while (num != 0) {
            numeros.add(num);
            num = ler.nextInt();
        }
        
        int pares = 0, impares = 0;
        double media = 0;
        for (int i=0; i < numeros.size(); i++) {
            if (numeros.get(i)%2 == 0) {
                pares++;
                media += numeros.get(i);
            } else { 
                impares++;
            }
        }
        
        media = media / pares;
        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de impares: " + impares);
        System.out.println("Media dos pares: " + media);        
    }
}
