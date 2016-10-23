import java.util.Scanner;
import java.lang.String;

public class Exercicios
{
    public static void ex4(){
   Scanner ler = new Scanner(System.in);
   
   boolean diferente = true;
   int i,j,conta=0,tamanho=0;     
       
        System.out.println("Introduza uma string: ");
        String s1 = ler.nextLine();
        System.out.println("Introduza uma substring subcadeia: ");
        String s2 = ler.nextLine();
        
        for(i=0; i<s1.length();i++){
             if(s2.charAt(0)==s1.charAt(i)){
                 
                 for(j=1; j<s2.length() && diferente==true;j++){
                     
                     if((i+j)>=s1.length()){
                        diferente=false;
                     } 
                     else {
                         if(s2.charAt(j)!=s1.charAt(i+j)){
                             diferente = false;
                         }
                     }
                }
                
                 if(diferente==true) conta++;
             }
            diferente=true;
        } 
        System.out.println(conta);
    }
}



















