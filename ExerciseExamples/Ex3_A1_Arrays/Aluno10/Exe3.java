
import java.util.Scanner;
public class Exe3
{
   public static void main (String args[]) {
       
       int n;
       Scanner scan = new Scanner (System.in);
       System.out.println ("Digite um tamanho para o array");
       n = scan.nextInt();
       int i = 0;
       int conta = 0;
       int numero;
       int []arr = new int[n];
       while (i < n){
       System.out.println("Digite um numero");
       numero = scan.nextInt();
       if (numero % 2 == 0)
       conta++;
       
       arr[i] = numero;
       i++;
       
      }
      System.out.println("O numero de pares no array é : " + conta);
    }
}
