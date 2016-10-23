import java.util.Scanner;
import java.lang.String;

public class Exercicios
{
    public static void ex1 (){
        
        Scanner scan = new Scanner(System.in);
        int x, pares=0, impares=0, soma=0;
        float media=0;
       
       
        do{ 
            System.out.println("Digite uma sequência de números: ");
            
            x = scan.nextInt();
            
            if(x<0) {
                System.out.println("Número inválido");
                return;
            }
            
            if(x%2==0) {
                if(x!=0)
                pares++;
                soma += x;
            }
            else impares++;  
        }
        
        while(x!=0); 
        
        media = (float) soma/pares;
        
        System.out.println("Pares: "+pares);
        System.out.println("Impares: "+impares);
        System.out.println("Média: "+media);
        
        scan.close();
}

}



















