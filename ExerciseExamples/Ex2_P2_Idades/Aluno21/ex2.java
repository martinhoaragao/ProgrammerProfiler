

import java.util.Scanner;

public class ex2
{   
    public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
     int nid;
     int m, soma = 0;
     int i, nint;
     int f=0;
     double media=0.0;
     System.out.println ("Nº de idades a ler : ");
     nid = sc.nextInt();
     System.out.println ("Valor defenido para a idade min: ");
     m = sc.nextInt();
     for (i=0;i<nid;i++){
         nint = sc.nextInt();
         soma += nint;
         f++;
         if (nint > m) {
             System.out.println("Valor maior que : " + nint);
         }
        }
     media = soma / f;
     System.out.println ("A média é: " + media);
     sc.close();
    }
}
