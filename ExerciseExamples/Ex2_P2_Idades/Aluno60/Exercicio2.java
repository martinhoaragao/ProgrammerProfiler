import java.io.*;
import java.util.Scanner;

public class Exercicio2
{
    public static void main(String[] args){
        int N, M, idade, aux, total = 0;
        double media;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira N e M");
        N = sc.nextInt();
        M = sc.nextInt();
        aux = N;
        while(N > 0){
            idade = sc.nextInt();
            if(idade > M)
                System.out.println("Idade lida: " + idade);
            total += idade;
            N--;
        }
        media = total/aux;
        System.out.println("Media de idades lidas: " + media);
    }
}
