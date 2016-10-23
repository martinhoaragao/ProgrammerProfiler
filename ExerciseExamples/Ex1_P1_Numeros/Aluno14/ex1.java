import java.util.Scanner;
import java.util.ArrayList;

public class ex1{
    
    public static void main(String[] args){
        inputNumeros();
    }
    
    public static void inputNumeros(){
        int pares = 0;
        int impares = 0;
        int total = 0;
        int contador = 0;
        double media;
        int n;
        Scanner s = new Scanner(System.in);
        do{ 
            System.out.print("Introduza um número: ");
            n = s.nextInt();
            if(n!=0){
                total += n;
                if(n%2 == 0) pares ++;
                else impares++;
                contador++;
            }
        }while(n!=0 && n>0);
        media = total / contador;
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
        System.out.println("Média: " + media);
    }
    
}
