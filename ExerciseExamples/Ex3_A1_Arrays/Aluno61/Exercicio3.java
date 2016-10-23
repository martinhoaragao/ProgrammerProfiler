

import java.util.Scanner;

public class Exercicio3
{
   public static void exer3(int n){
       
       int array[] = new int[n];
       
       Scanner ler = new Scanner(System.in);
       int x;
       int i;
       int pares = 0;
       
       for(i = 0;i < n;i++){
           
           System.out.println("Introduz um número inteiro");
           x = ler.nextInt();
           
           array[i] = x;
        }
        
        for(i=0; i < array.length;i++){
           if(array[i]%2 == 0){
               pares++;
            }
           
        }
        
        System.out.println("O número total de pares do array é:" + pares +"\n");
    }
}
