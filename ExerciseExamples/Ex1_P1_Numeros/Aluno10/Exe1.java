
import java.util.Scanner;
public class Exe1
{
    public static void main (String args[]) {
            int somador_par = 0;
            int conta_par = 0;
            int conta_impar = 0;
            double media_par = 0.0;
            int check;
            Scanner s = new Scanner (System.in);
            while (true) {
             System.out.println ("Digite um numero");
             check = s.nextInt();
             if (check == 0)
             break;
             
             if (check % 2 == 0)
             {
                 conta_par++;
                 somador_par = somador_par + check;
             }
             else
             conta_impar++;
            }
            media_par = somador_par/conta_par;
            System.out.println ("Média de pares: " + media_par);
            System.out.println ("Soma dos pares: " + somador_par);
            System.out.println ("Conta nr de pares: " + conta_par);
            System.out.println ("Conta nr de impares: " + conta_impar);
    }
}
