import java.util.Scanner;
import java.lang.String;


public class Ficha8 {
    
    public static void exercicio4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor insira a cadeia de caracteres que deseja: ");
        String cadeia = scanner.nextLine();
        System.out.println("Por favor insira a subcadeia: ");
        String subcadeia = scanner.nextLine();
        int count = 0;
        int tamanhos = subcadeia.length();
        for (int i = 0; i < (cadeia.length() - tamanhos +1) ; i++) {
            if (cadeia.substring(i,i + tamanhos).equals(subcadeia)) {
                count++;
            }
        }
        System.out.println("O número de vezes que a subcadeia aparece é: " + count); 
    }
    
}
