import java.util.Scanner;

public class Exercicios
{
    /**
      * Escreva um programa Java que leia uma quantidade não determinada de números inteiros positivos (o número que encerrará a leitura será o zero). Calcule e imprima a quantidade
      * de números pares e ímpares assim como a média (numero real) dos valores pares.
      */
    public static void exercicio1(){
        int par = 0, impar = 0;
        double media, soma = 0;
        Scanner ler = new Scanner(System.in);
        while (true) {
            System.out.println("Insira um número:");
            int n = ler.nextInt();
            if (n == 0) break;
            if (n > 0) {
                if (n%2 == 0) {
                    soma += n;
                    par++;
                }
                else impar++;
            }
            else System.out.print("Número inválido. ");
        }
        media = soma / par;
        System.out.println("Quantidade de números pares: " + par + "\nQuantidade de números ímpares: " + impar + "\nMédia dos números pares: " + media);
    }
}
