

import java.util.Scanner;

public class Exercicio3{
   
    public static void exercicio3 (int n){
        
        int array[] = new int[n];
        Scanner s = new Scanner(System.in);
        int x;
        int nPares = 0;
       
        
        for(int i = 0; i < n ; i++){
            System.out.print("Introduza um valor: ");
            x = s.nextInt();
            
            array[i] = x;   
        }  
        
        for(int i = 0; i < array.length; i++){
            if(array[i] %2 == 0) nPares++;
        }
        
        System.out.println("Existem no vector " + nPares + " elementos pares!");
        
    }
}
