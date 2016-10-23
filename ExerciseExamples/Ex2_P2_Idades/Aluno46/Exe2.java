

import java.lang.System.*;
import java.util.Scanner;

public class Exe2
{
    public static int main (){

        int n, m, soma, numero, lido;
        float media;

        Scanner scanner = new Scanner(System.in);

        System.out.println("insere o N");
        n = scanner.nextInt();

        System.out.println("insere o M");
        m = scanner.nextInt();

        soma = 0;
        numero = 0;

        while(n > 0){
            
            System.out.println("insere a idade");
            lido = scanner.nextInt();

            if(lido > m)
                System.out.println( lido + " maior que M");

            soma+=lido;
            numero++;
            n--;
        }

        media = (float) soma/numero;

        System.out.println("a media e = " + media);

        return 0;
    }
}
