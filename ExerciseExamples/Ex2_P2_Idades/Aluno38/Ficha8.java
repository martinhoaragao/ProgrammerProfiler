package ficha8;

import java.util.Scanner;

public class Ficha8 {
    
    public static void exercicio2() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduza quantas idades pretende ler: ");
        int n = sc.nextInt();
        System.out.print("Pretende calcular quantas idades inseridas sao superiores a que valor? ");
        int m = sc.nextInt();
        int count = 0;
        int[] maiores = new int[m];
        
        int valorAt;
        while(n > 0) {
            System.out.print("Introduza idade: ");
            valorAt = sc.nextInt();
            
            if(valorAt > m) {
                maiores[count] = valorAt;
                count++;
            }
            n--;
        }
        
        if(count > 0) {
            System.out.println("Existem " + count + " idades, superiores a " + m + ".");
            int i = 0;
            System.out.print("Idades: ");
            while(count > 0) {
                if(maiores[i] > m) System.out.print(maiores[i] + "   ");
                else break;
                i++;
            }
        }
        else System.out.println("Nenhuma das idades introduzidas é superior a " + m + ".");
        System.out.println("");
    }
}