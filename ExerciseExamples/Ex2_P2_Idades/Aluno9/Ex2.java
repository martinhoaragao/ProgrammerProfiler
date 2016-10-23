import java.util.Scanner; 
import java.io.*; 
import java.util.*;

public class Ex2
{
    public static void main(String[] args){
        int n, m, idade, soma = 0, i, j;
        double media;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduza um valor para o número de idades: "); 
        n =  sc.nextInt();
       
        System.out.println("Indique o valor da idade a comparar (valor mínimo): ");
        m = sc.nextInt();
        
        int [] idades = new int[n];
        
        System.out.println("Introduza a sequência de idades:");
        for(i=j=0; i<n; i++) {
            idade =  sc.nextInt();
            
            if(idade > m) {
                idades[j] = idade;
                j++;
            }
            
            if(m<0) {
                System.out.println("m tem de ser um número positivo!");
                m = sc.nextInt();
            }
            
            if(n<0) {
                System.out.println("n tem de ser um número positivo!");
                n =  sc.nextInt();
            }
            
            soma += idade;
        } 
        
        System.out.println("Idades superiores a "+m+" anos:");
        
        i=0;
        while(i<j) {
           System.out.println(idades[i]); 
           i++;
        }
        
        media = (double) soma/n;
        System.out.println("Média de Idades: "+ media);
    }
}