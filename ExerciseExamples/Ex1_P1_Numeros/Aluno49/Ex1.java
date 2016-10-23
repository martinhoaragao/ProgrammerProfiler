import java.util.Scanner;
/**
 * Escreva um programa Java que leia uma quantidade não de-
 * terminada de números inteiros positivos (o número que encer-
 * rará a leitura será o zero). Calcule e imprima a quantidade de
 * números pares e ímpares assim como a média (numero real)
 * dos valores pares
 */
public class Ex1
{
    public static void main()
    {
        int somas, pares, impares, f, media;
        somas = pares = impares = 0;
        Scanner s = new Scanner(System.in);
        while((f = s.nextInt()) != 0)
        {
            if ((f%2) == 0) pares++;
                else impares++;
            somas += f;
        }
        media = somas /(pares + impares);
        
        System.out.println("Números ímpares : " +impares);
        System.out.println("Números pares : " +pares);
        System.out.println("Média : " +media);
    }
}
