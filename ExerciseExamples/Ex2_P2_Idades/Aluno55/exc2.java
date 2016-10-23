import java.util.ArrayList;
import java.util.Scanner;
public class exc2
{
   ArrayList<Integer> idadesMaior;
    int total;
    int lido;
    
    public void correrExercicio2(int n, int m){
        int index = 0;
        idadesMaior = new ArrayList<Integer>(n);
        
        Scanner input = new Scanner(System.in);
        
        
        for(index = 0; n - index > 0; index++){
            System.out.println("Falta introduzir " + (n-index) + " idades:");
            lido = input.nextInt();
            
            if(lido > 0){
                total += lido;
                
                if(lido > m){
                    idadesMaior.add(lido);
                    System.out.println("Idades maiores que " + m + ": " + idadesMaior.toString());
                }
            }
        }
        
        
        input.close();
        
        System.out.println("A média das idades é: "+ total / n);
    }
}
