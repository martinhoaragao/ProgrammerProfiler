

import java.util.Scanner;

public class Exercicio2
{
   public static void exer2(int m,int n){
       Scanner ler = new Scanner(System.in);
       double media;
       int somatorio = 0;
       int i;
       int x;
       
       for(i=0; i < n;i++){
           System.out.println("Indique uma idade:");
           
           x = ler.nextInt();
           
           somatorio += x;
           
           if(x>m){
               System.out.println("Idade" + x);
            }
           
        }
        
        media = (double) somatorio/ (double) i;
        
        System.out.println("A media de idade lidas é:" + media +"\n");
       
       
    }
}
