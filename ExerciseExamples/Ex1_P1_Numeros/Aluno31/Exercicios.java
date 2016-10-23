import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;


public class Exercicios
{
   public static void ex1(){
       Scanner sc = new Scanner (System.in);
       int j;
       int p=0;
       int i=0;
       double med = 0;
       System.out.println("Insira os números inteiros a usar");
       j = sc.nextInt();
       while(j>0){
        if( j%2 == 0){
            p++;
            med +=j;
        }
        else i++;
        j = sc.nextInt();
        }
        sc.close();
        med = med/p;
       System.out.println("Pares: "+p+" Média Par: "+ med+ " Ímpares: "+i);
    }
    
    
}