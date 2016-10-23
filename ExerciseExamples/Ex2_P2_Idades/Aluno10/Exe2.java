

import java.util.Scanner;
public class Exe2
{
   public static void main (String args[]){

       Scanner scan = new Scanner (System.in);
       int m;
       int n;
       
       System.out.println("Digite um número m");
       m = scan.nextInt();
       System.out.println("Digite um número n");
       n = scan.nextInt();
       int conta_idade = 0;
       int soma_idade = 0;
       double media_idades = 0.0;
       int idade;
       while (n > 0)
       {
           System.out.println ("Digite uma idade");
           idade = scan.nextInt();
           n--;
           if (idade > m){
           conta_idade++;
           soma_idade += idade;
           }
       }
       System.out.println ("Media idades: " + soma_idade/conta_idade);
   }
}
