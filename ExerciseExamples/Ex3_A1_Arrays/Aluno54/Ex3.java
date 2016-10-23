package FICHA8;

import java.util.Scanner;

public class Ex3 {
    
    public static void main(int N) {
        
        int[] v      = new int[N];
        int i        = 0;
        int contador = 0;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite os elementos do vector!");
        while(i<N) {
            
            v[i] = ler.nextInt();
            if (v[i]%2==0)
                contador++;
            i++;
            
        }
        System.out.println("\nForam introduzidos " + contador + " números pares!\n");
        
    }
    
}
