import java.util.*;

public class ex1 {
    
    public static void main() {
        int nPares = 0, nImpares = 0, leitura;
        float mediaPares = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduza os valores");
        while ((leitura = input.nextInt()) != 0) {
            if (leitura % 2 == 0) {
                nPares++;
                mediaPares += leitura;
            }
            else nImpares++;
        }
        mediaPares = mediaPares / nPares;
        System.out.println("Quantidade de pares: " + nPares);
        System.out.println("Quantidade de ímpares: " + nImpares);
        System.out.println("Média dos pares: " + mediaPares);
    }
}