

import java.util.Scanner;
public class Ex2
{
    public void ex2(int N, int M){
    Scanner input = new Scanner(System.in);
    int i=0;
    int idade, somaIdades = 0, maiores = 0;
        while(i<N){
            System.out.println("Escreva uma idade:");
            idade = input.nextInt();
            somaIdades += idade;
            if(idade>M){
                System.out.println("A idade introduzida é superior a " + M + ".");
                maiores++;
            }
            i++;
        }
        System.out.println("Existem " + maiores + "idades maiores que " + M + ".");
        System.out.println("A média é " + (somaIdades/N));
    }
} 
