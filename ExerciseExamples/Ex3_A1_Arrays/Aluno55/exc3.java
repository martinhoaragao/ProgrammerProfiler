

import java.util.Scanner;

public class exc3
{
     private int[] vetor;
    private int nrPares;
    private int lido;
    
    public exc3(){
        nrPares = 0;
        lido = 0;
    }
    
    public void correrExercicio3(int n){
        int index;
        vetor = new int[n];
        
        Scanner ip = new Scanner(System.in);
        for(index = 0; n - index > 0; index++){
            System.out.print("Faltam introduzir " + (n - index) + " valores: ");
            lido = ip.nextInt();
            vetor[index] = lido;
            if(lido % 2 == 0) nrPares++;
        }
        
        System.out.println("Existem " + nrPares + " números pares.");
    }
}
