import java.util.Scanner;


public class Exercicio1a4
{   
    public static void exercicio1(){
        int pares=0,impares=0;
        double soma=0, media=0;
        System.out.println("introduza um numero");
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        while (n!=0){
            if (n%2==0) {pares++;soma+=n;}
            else impares++;
            System.out.println("introduza um numero");
            n = ler.nextInt();
        }
        System.out.println("numero de pares: " + pares + "\n"+
                           "numero de impares: " + impares + "\n"+
                           "numero de media: " + soma/pares + "\n");
    }
}




























