import java.util.Scanner;
import java.lang.String;



public class Ficha8 {
    
    public static void exercicio2(int m, int n) {
        Scanner scanner = new Scanner(System.in);
        double media = 0;
        int somaIdades = 0;
        for(int i = 0; i < n; i++) {
            System.out.println("Por favor introduza uma idade: ");
            int x = scanner.nextInt();
            if (x > n) { 
                System.out.println(x + " é maior que " + n);
            }
            somaIdades += x;
        }
        media = somaIdades/n;
        System.out.println("A média das idades é: " + media);
    }
    
}
