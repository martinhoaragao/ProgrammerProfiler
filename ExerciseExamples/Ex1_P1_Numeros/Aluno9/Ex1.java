

import java.util.Scanner;

public class Ex1
{
   public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    
    int VALOR_STOP = 0, n_pares = 0, n_impares = 0, soma = 0;
    boolean terminou = false;
   
    System.out.println("Introduza uma Sequência de números positivos:");
    System.out.print("Valor: ");
    
    while(!terminou && sc.hasNext()){
      
      int valor = sc.nextInt();
      
      if(valor == VALOR_STOP) {
          terminou = true;
      }
      else if (valor < 0)  {
          System.out.println("Introduza somente números positivos!");
          System.out.print("Valor: ");
      }
      else {
          System.out.print("Valor: ");
          if(valor % 2 == 0)
            n_pares++;
          else 
            n_impares++;
          
      soma+=valor;
          
      }
        
    }
    
    System.out.println("Números pares: " + n_pares);
    System.out.println("Números impares: " + n_impares);
    System.out.println("Média: " + (soma/(n_pares+n_impares)));
    
    }
    
}
