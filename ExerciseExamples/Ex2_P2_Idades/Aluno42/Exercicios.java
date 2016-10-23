import java.util.Scanner;
import java.lang.String;

public class Exercicios
{
    public static void ex2(int M, int N ){
       
       Scanner scan = new Scanner(System.in);
       
       int x=0, soma=0;
       float media=0;
       
        for(int i = 0; i<N; i++){
            
           System.out.println("Digite uma idade: ");
           x = scan.nextInt();
           
           if(x > M) {
               
               System.out.println("É maior"); 
            }
            else System.out.println("Não é maior");
            
            soma+=x;   
    }
            media = (float) soma/N;
            System.out.println("Média: "+media);
            scan.close();
}

}



















