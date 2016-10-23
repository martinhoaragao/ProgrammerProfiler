

import java.lang.System.*;
import java.util.Scanner;

public class Exe1
{

    public static int main () {

        Scanner scanner = new Scanner(System.in);
        int soma, lido, numero, pares, impares;
        float media;
        soma = 0;
        numero = 0;
        media = 0;
        pares = 0;
        impares = 0;

        while(true){
            System.out.println("insere um numero");
            lido = scanner.nextInt();
            
            if(lido == 0)
                break;
            
            soma+=lido;
            numero++;

            if(lido%2 == 0)
                pares++;
            else 
                impares++;
        }

        media = (float) soma/numero;

        System.out.println("a media e = " + media);
        System.out.println("pares = " + pares);
        System.out.println("impares = " + impares);

        return 0;
    }

}
