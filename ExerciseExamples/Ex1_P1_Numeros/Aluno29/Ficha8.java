import java.util.Scanner;

public class Ficha8 {
    static Scanner sc = new Scanner (System.in);
    
    public static void ex1 () {
        int n, nPares = 0, nImpares = 0, media = 0;
        while ((n = sc.nextInt()) != 0) {
            if ((n % 2) == 0) {
                nPares++;
                media += n;
            }
            else {
                nImpares++;
            }
        }
        media = media / nPares;
        
        System.out.println ("O nº de pares foi " + nPares + ", o de ímpares foi " + nImpares +
                            " e a média dos números pares foi " + media + ".\n");
    }
}