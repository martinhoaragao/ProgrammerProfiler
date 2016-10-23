import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercicio3 {
    public static void main (int[] a, int N) {
        
        int pares = 0;
        
        for(int i = 0 ; i < N; i++) {
            
            if(a[i] % 2 == 0)
                pares++;
            
        }
        
        if(pares > 1)
            System.out.println("Existem " + pares + " numeros pares no array que introduziu!");
        if(pares == 1)
            System.out.println("Existe " + pares + " numero par no array que introduziu!");
        if(pares == 0)
            System.out.println("Não existem numeros pares no array que introduziu!");
    }
}
