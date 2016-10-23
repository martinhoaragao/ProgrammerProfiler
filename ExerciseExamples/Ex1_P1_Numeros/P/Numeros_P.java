
import java.util.Scanner;
import java.lang.System;

public class ExNumeros_Teste {
    
    public static void main(String[] args) {   
                int np=0,ni=0,num,soma=0;
                float media;
         Scanner ler = new Scanner(System.in);
        do{
            System.out.println("Introduza um numero.");
            num= ler.nextInt();            
          }while( num<0);   
         
         while(num!=0){
            if (num %2==0){
                 np=np+1;
                 soma=soma+num;}
             else
                  ni=ni+1;
            do{
            System.out.println("Introduza um numero.");
                num= ler.nextInt();
            }while( num<0);        
         }
         media=soma/np;        
        System.out.println(np);
        System.out.println(ni);
        System.out.println(media);
//System.exit(0);
    }
    
}
