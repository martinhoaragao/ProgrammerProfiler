import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;


public class Exercicios
{
   public static void ex3(int m,int n){
    int[] vector = new int[n];
    int pares = 0;
    int j = 0;
    Scanner sc = new Scanner (System.in);
    System.out.println("Insira os números do vector");
    while(j<n){
        vector[j] = sc.nextInt();
        j++;
    }
    for(j=0;j<n;j++){
        if(vector[j]%2 == 0)
            pares++;
    }
    System.out.println("Valores pares: " + pares);
    
    }
    
    
}