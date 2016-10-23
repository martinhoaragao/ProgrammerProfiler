import java.util.Scanner;

public class Ficha8 {
    static Scanner sc = new Scanner (System.in);
    
    public static void ex2 (int M, int N) {
        int conta = 0, idade, i, media = 0, indice = 0;
        int[] idades;
        idades = new int[N];
        for (i = 0; i < N; i++) {
            idade = sc.nextInt();
            if (idade > M) {
                //System.out.println ("A idade " + idade + " é superior à idade " + M + ".\n");
                idades[indice] = idade;
                indice++;
                media += idade;
                conta++;
            }
            else {
                media += idade;
                conta++;
            }
        }
        media = media / conta;
        
        System.out.println ("As idades superiores a " + M + " foram:");
        for (i = 0; i < indice; i++) {
            System.out.println (idades[i]);
        }
        System.out.println ("A média de idades foi " + media + ".\n");
    }
}