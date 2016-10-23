import static java.lang.System.out;
import java.util.Scanner;

public class P1 {

    public static void main(String[] args) {
        int nPares = 0, nImpares = 0, soma = 0;

        while(true){
            out.println("Insira um numero:");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();

            if(num == 0) break;
            if(num%2 == 0) {
                nPares++;
                soma += num;
            }
            else nImpares++;
        }

        double media = 0;
        if (nPares != 0) media = soma / nPares;

        out.println("Pares: " + nPares + " -> Impares: " + nImpares + " -> Media dos Pares: " + media);
    }
}
