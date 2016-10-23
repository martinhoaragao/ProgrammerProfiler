import java.util.Scanner;


public class exercicio3
{
    
    public static void ex3 (int N) {
       int[] array = new int[N];
       int n = 0;
       Scanner ler = new Scanner(System.in);
       for (int c = 0; c <N; c++){
        System.out.println("Escreva um inteiro: " );
        int x = ler.nextInt();
        array[c] = x;
        if (x%2 == 0) {
            n++;
        }
       
     }
        
       System.out.print("\nNumero de inteiros pares: " + n + "\n");
    }
}
