
import java.util.*;

public class Exercicios
{

    public static void exercicio_3 (){  
        Scanner s = new Scanner ( System.in );
        
        int numero = 0, pares = 0, i = 0, i_atual = 9;
        System.out.println("Qual o numero de inteiros positivos que o vetor vai conter?");
        numero = s.nextInt();
        int aux = numero;
        int[] sequencia = new int[numero];
        
            while(numero<=0){
                System.out.println("Qual o numero de inteiros positivos que o vetor vai conter?");
                numero = s.nextInt();
            }
            
            while(numero!=0){
                System.out.println("Qual o " + (i+1) + "º inteiro? |0 - Sair|");
                i_atual = s.nextInt();
                    while(i_atual<=0){
                        System.out.println("Numero Incorreto! Coloque numeros inteiros positivos!");
                        System.out.println("Qual o " + (i+1) + "º inteiro positivo? |0 - Sair|");
                        i_atual = s.nextInt();
                }
                
                sequencia[i] = i_atual;
                
                i++;
                numero--;
            }
            
        
            for(int n = 0; n!= aux ; n++){
                if ((sequencia[n] % 2) == 0) pares++;
            }
        System.out.println("O numero de elementos pares no vetor é " + pares);
              
        }
}