import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;


public class Exercicios
{
   public static void ex2(int m,int n){
    List<Integer> num = new ArrayList<>();
    Scanner sc = new Scanner (System.in);
    int j;
    float med =0;
    int contaM =0;
    int conta = 0;
    System.out.println("Introduza as idades a usar");
    while(n > 0){
        j = sc.nextInt();
        if(j>m){
        conta++;
        contaM+=j;
        num.add(j);
        }
        n--;

    }
    sc.close();
    med = contaM/conta;
    System.out.println("Números maiores que "+ m+ ":");
    for(int i:num){   
    System.out.print(i+" ");
    }  
    System.out.print("\n");
    System.out.println("Média dos números: "+ med);
    
    }
    
    
}