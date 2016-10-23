import java.util.Scanner;

/* P1) Escreva um programa Java que leia uma quantidade não determinada de números inteiros positivos
*  (O número que encerrará a leitura será o zero). Calcule e imprima a quantidade de números pares e ímpares
*  assim como a média (numero real) dos valores pares.*/

public class P1 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int read, par, acc, impar = par = acc = 0;
        do {
            System.out.print("Insira um numero: ");
            read = sc.nextInt();
            if (read > 0) {
                if ((read & 1) == 0) {
                    par++;
                    acc += read;
                }
                else
                    impar++;
            }
        } while (read != 0);
        System.out.println("Pares: " + par + "\nImpares: " + impar + "\nMedia Pares: " + (float)acc/par);

    }

}
