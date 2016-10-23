

import java.util.Scanner;

public class Exercicio1
{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        double media;
        int pares = 0;
        int impares = 0;
        int conta = 0;
        int i;
        
        System.out.println("Indique uma numero:");
        i = ler.nextInt();
        while(i!=0){
            conta+=i;
            if(i%2 == 0){
                pares++;
            }
            else{
                impares++;
            }
            
            System.out.println("Indique uma numero:");
            i = ler.nextInt();
                
        }
        
        media  = (double) conta/ (double) pares;
        
        System.out.println("A quantidade de números pares é: " + pares);
        System.out.println("A quantidade de números ímpares é: " + impares );
        System.out.println("A média de números pares é: " + media +"\n");
    }
}
