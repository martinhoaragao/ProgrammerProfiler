

import java.util.Scanner; 
 
public class Ex3
{
    public static void main(String[] args){
        
        int n, num, npares = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduza o número de elementos do vector: ");
        n = sc.nextInt();
        
        int vector[] = new int[n];
        
        for(int i=0; i<n; i++){
            
            if(n<=0) {
                System.out.println("Insira um valor superior a 0 para o número de elementos do vector!");
                n = sc.nextInt();
            }
            
            System.out.print((i+1)+"º Elemento: ");
            
            num = sc.nextInt();
            
            vector[i]=num;
            
            if(vector[i] % 2 == 0)
                npares++;
        }
        
        
        System.out.print("Número de números pares: " + npares);
    }
}
