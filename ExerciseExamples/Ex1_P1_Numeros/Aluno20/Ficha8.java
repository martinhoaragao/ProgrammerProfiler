import java.util.Scanner;
import java.lang.String;


public class Ficha8 {
    
    public static void exercicio1() {
        Scanner scanner = new Scanner(System.in);
        int x, pares = 0, impares = 0, somap = 0;
        double media = 0;
        System.out.println("Insira um número: ");
        x = scanner.nextInt();
        while(x != 0) { 
            if( (x % 2) == 0) {
                pares++;
                somap += x;
            }
            else impares++;
            System.out.println("Insira um número: ");
            x = scanner.nextInt();
        }
        System.out.println("O total de números pares lidos é: " + pares);
        System.out.println("O total de números impares lidos é :" + impares);
        media = somap/pares;
        System.out.println("A média dos pares é: " + media);
    }
    
    
}
