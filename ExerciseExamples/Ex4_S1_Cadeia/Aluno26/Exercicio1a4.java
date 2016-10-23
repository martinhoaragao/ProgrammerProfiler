import java.util.Scanner;


public class Exercicio1a4
{   
    public static void exercicio4(String sub, String cad){
       int i,j,c,n=0;
       for(i=0; cad.length()>i; i++){
           for(c=i,j=0; sub.length()>j && cad.length()>c && cad.charAt(c)==sub.charAt(j) ;c++,j++);
           if (j==sub.length()) n++;
       }
       System.out.println("Subcadeias: " + n);
    }
}




























