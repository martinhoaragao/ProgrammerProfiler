import java.util.Scanner;
public class Main
{
    public static void exercicio1 (){
        int x, i;
        int pares = 0, impares = 0, soma = 0;
        Scanner s = new Scanner(System.in);
        for (i = 1; true; i++){
            x = s.nextInt();
            if (x == 0){
                break;
            }
            if (x % 2 == 0){
                pares++;
                soma += x;
            }
            else {
                impares++;
            }
        }
        System.out.println ("Pares: " + pares + "\nImpares: " + impares + "\nMedia: " + (double) soma/pares);
    }

}
