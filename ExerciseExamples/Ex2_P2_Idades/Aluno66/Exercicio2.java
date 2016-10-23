

import java.util.Scanner;
import java.lang.Integer;

public class Exercicio2
{
    public static void main(String args[]){
        int i, w = 0,sum = 0, next, m = 0, n = 0;
        float mean;
        Scanner ler = new Scanner(System.in);
        try{
            m = Integer.parseInt(args[0]);
        }
        catch(NumberFormatException e){
            System.out.println("Argumento inválido!");
            System.exit(1);
        }
        try{
            n = Integer.parseInt(args[1]);
        }
        catch(NumberFormatException e){
            System.out.println("Argumento inválido!");
            System.exit(1);
        }
        if(m <= 0 || n <= 0){
            System.out.println("Os argumentos devem ser inteiros positivos!");
            System.exit(1);
        }
        int arr[] = new int[n];
        for(i = 0; i < n; i++){
            System.out.println("Insira uma idade:");
            next = ler.nextInt();
            if(next > m){ arr[w] = next; w++;}
            sum += next;
        }
        System.out.println("Idades maiores do que "+m+":");
        for(i = 0; arr[i] > 0; i++){
            System.out.println(arr[i]);
        }
        mean = sum/n;
        System.out.println("Média das idades: "+mean);
    }
}
