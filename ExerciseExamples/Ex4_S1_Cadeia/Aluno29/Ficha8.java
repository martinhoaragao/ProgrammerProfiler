import java.util.Scanner;

public class Ficha8 {
    static Scanner sc = new Scanner (System.in);
    
    public static void ex4 (String cadeia, String subcadeia) {
        int conta = 0, i = 0, n;
        while (i < cadeia.length()) {
            n = cadeia.indexOf(subcadeia, i);
            System.out.println (n);
            if (n != -1) {
                conta++;
                i = n + 1;
            }
            else {
                i = cadeia.length();
            }
        }
        
        System.out.println ("A subcadeia " + subcadeia + " aparece " + conta + 
                            " vezes na cadeia " + cadeia + " .\n");
    }
}