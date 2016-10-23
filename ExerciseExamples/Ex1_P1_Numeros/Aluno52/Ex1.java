

import java.util.Scanner;
public class Ex1
{
    /**
     *          Programa que lê uma quantidade não determinada
     * de números inteiros positivos (o número que encerrará
     * a leitura será o zero). Calcula e imprime a quantidade de
     * números pares e ímpares assim como a média (numero real)
     * dos valores pares.
     */
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int nextNumber;
        int nPares = 0;
        int nImpars = 0;
        int soma = 0;
        double media;

        while((nextNumber = in.nextInt())!= 0){
            if ((nextNumber % 2) == 0) {
                nPares++;
                soma += nextNumber;
            }
            else nImpars++;
        };
        
        System.out.println("Foram inseridos "+nPares+" números pares.");
        System.out.println("Foram inseridos "+nImpars+" números impares.");
        media = (soma)/(nPares);
        System.out.println("A média dos números pares é "+media);
        
    }

}
