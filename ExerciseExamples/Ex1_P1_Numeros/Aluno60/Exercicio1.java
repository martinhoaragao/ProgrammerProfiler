import java.io.*;
import java.util.Scanner;

public class Exercicio1
{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int pares = 0, impares = 0, somapares = 0, aux = 1;
       double mediapares;
       System.out.println("Insira numeros");
       while( true ){
           aux = sc.nextInt();
           if(aux == 0) break;
           if(aux % 2 == 0){
               pares++;
               somapares += aux;
           }
           else
               impares++;
       }
       mediapares = somapares/pares;
       System.out.println("Nº imp: " + impares + " Nº par: " + pares + " Media pares: " + mediapares); 
   }
}
