import java.util.Scanner;



public class exercicio1
{
    public static void ex1 (){
        System.out.print("Digite a sequência de números pretendida e terminada em zero.\n");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int somapares = 0;
        int pares = 0;
        int impares = 0;
         while (i != 0) {
            if(i % 2 == 0) { 
            pares ++;
            somapares += i;
           }
           else {
            impares ++;
         }
         i = scanner.nextInt();
        }
        float media = (float)somapares/pares;
        System.out.print("Número de ímpares:" + impares + "\nNúmero de pares:" + pares + "\nMédia dos números pares:" + media + "\n");
       
    }
}