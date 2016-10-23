import java.util.Scanner;
import java.util.Vector;

import static java.lang.System.out;

public class A1 {

    public static void main(String[] args) {
        out.println("Insira o tamanho do vector:");
        Scanner input = new Scanner(System.in);
        int tam = input.nextInt();

        Vector lista = new Vector(tam);
        while (tam > 0){
            out.println("Insira um numero inteiro:");
            lista.add(input.nextInt());
            tam--;
        }

        int nPares = 0;
        for(Object item: lista){
            if((int)item % 2 == 0) {nPares++;}
        }

        out.println("Numero de pares: "+ nPares);
    }

}
