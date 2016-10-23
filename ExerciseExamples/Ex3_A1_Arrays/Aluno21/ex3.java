

import java.util.Scanner;

public class ex3
{
  public static void main () {
    int tam, i , n;
    int ct = 0;
    Scanner sc = new Scanner (System.in);
    System.out.println("O tamanho do array é: ");
    tam = sc.nextInt();
    int [] lista = new int [tam];
    for (i=0;i<tam;i++) {
        n = sc.nextInt();
        lista[i]= n;
    }
    for (i=0; i < tam ; i++) {
      if (lista[i]%2 == 0) {  
      ct++;
     }
    }
    System.out.println ("Existem " + ct + " pares na lista.");
    sc.close();
   }
    
    
}
