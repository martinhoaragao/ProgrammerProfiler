import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main
{
    static Scanner scan = new Scanner(System.in);
    
    public static void p1() {
        System.out.println("Introduza a sequência de inteiros positivos:");
        int pares = 0, impares = 0, sum = 0;
        int num;
        do {
            num = scan.nextInt();
            if (num % 2 == 0){
                pares++;
                sum += num;
            }
            else impares++;
        }while (num != 0);
        
        System.out.println("Pares: " + (pares-1) + "\nImpares: " + impares + "\nMédia dos pares: " + (float) sum / (pares-1));
    }
}