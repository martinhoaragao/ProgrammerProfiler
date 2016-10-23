

import java.lang.Integer;
import java.util.Scanner;

public class Exercicio3
{
    public static void main(String args[]){
        int i, next,n = 0;
        Scanner ler = new Scanner(System.in);
        try{
            n = Integer.parseInt(args[0]);
        }
        catch(NumberFormatException e){
            System.out.println("Argumento inválido!");
            System.exit(1);
        }
        if(n <= 0){
            System.out.println("O argumento deve ser um inteiro positivo!");
            System.exit(1);
        }
        int[] arr = new int[n];
        for(i = 0; i < n; i++){
            System.out.println("Insira um inteiro:");
            next = ler.nextInt();
            arr[i] = next;
        }
        i = 0;
        for(int elem:arr){
            if(elem % 2 == 0) i++;
        }
        System.out.println(i+" números pares");
    }
}
