import java.lang.Math;
import java.util.ArrayList;
import java.util.Scanner;

public class EX1 {
    public static void main() {
        Scanner read = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println("Insira números positivo:");
        int prox = Math.abs(read.nextInt());
        while(prox != 0) {
            numeros.add(prox);
            prox = Math.abs(read.nextInt());
        }
        double media = 0;
        int numPares = 0;
        for(int i = 0; i < numeros.size(); i++) {
            if(numeros.get(i)%2 == 0) {
                media = media + numeros.get(i);
                numPares++;
            }
        }
        int numImpares = numeros.size() - numPares;
        media = media / numPares;
        System.out.println("Quantidade de pares: " + numPares);
        System.out.println("Quantidade de impares: " + numImpares);
        System.out.println("Media dos pares: " + media);
    }
}
