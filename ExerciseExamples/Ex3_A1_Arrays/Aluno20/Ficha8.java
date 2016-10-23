import java.util.Scanner;
import java.lang.String;


public class Ficha8 {
    
    public static void exercicio3(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] lista = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Por favor introduza um elemento: ");
            lista[i] = scanner.nextInt();
            if (lista[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("O número de elementos pares do vector é: " + count);
    }
    
}
