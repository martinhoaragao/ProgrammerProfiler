
//Exercicio 1

import static java.lang.System.out;
import java.util.Scanner;

public class Exercicio1{
    // Variáveis de Instância
    private int numPares;
    private int numImpares;
    private int total;
    private int totais;
    private int li;

    public Exercicio1(){
        numPares = 0;
        numImpares = 0;
        total = 0;
        totais = 0;
        li = 0;
    }
    
    public void Exercicio(){
        Scanner input = new Scanner(System.in);
        
        do{
            out.println("Introduzir número inteiro: ");
            li = input.nextInt();
            
            if(li > 0){
                if(li % 2 == 0){
                    numPares++;
                    total += li;
                }
                else{
                    numImpares++;
                    totais += li;
                }
            }
            
            out.println("Total de números pares: " + numPares);
            out.println("Total de números impares: " + numImpares);

        }
        while(li != 0);
        out.println("Média de números pares: " + total/numPares);
        out.println("Média de números impares: " + totais/numImpares);
        
        input.close();
    }
}
