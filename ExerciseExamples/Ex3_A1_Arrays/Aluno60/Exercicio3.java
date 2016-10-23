import java.io.*;
import java.util.Scanner;


public class Exercicio3
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N, i, pares = 0;
        System.out.println("Qual o tamanho do array?");
        N = sc.nextInt();
        int array[] = new int[N];
        for(i = 0; i < N; i++){
            array[i] = sc.nextInt();
            if(array[i] % 2 == 0) pares++;
        }
        System.out.println("Existem " + pares + " numeros pares no vector");
    }
}
