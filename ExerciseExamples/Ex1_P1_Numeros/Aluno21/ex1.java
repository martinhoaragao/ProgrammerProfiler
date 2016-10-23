

import java.util.Scanner;


public class ex1
{
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int npares = 0;
    int nimpares = 0;
    double mediap = 0.0;
    int soma = 0;
    int n;
     do {
      System.out.println("Indique um inteiro : ");
      n = sc.nextInt();
      if ( n%2 == 0) {
        npares++;
        soma = soma + n;
        }
      else {nimpares++;}
      } while (n!=0);
    mediap= soma/(npares-1);
    System.out.println ("Tem "+ nimpares + " numeros ímpares e tem  " + npares + " numeros pares.");
    System.out.println ("A média dos pares é :" + mediap);
    sc.close();
  }
  
}
