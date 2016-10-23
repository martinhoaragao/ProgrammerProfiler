package ficha8;

import java.util.Scanner;

public class Ficha8 {
    
    public static void exercicio1() {
        Scanner sc = new Scanner(System.in);
        int num_Intro, quant_Intro = 0, par = 0, impar = 0;
        double media = 0;
        
        System.out.print("Introduza um valor: ");
        num_Intro = sc.nextInt();
        
        while(num_Intro > 0) {
            if( num_Intro % 2 == 0) {
                par++;
                media += num_Intro;
                quant_Intro++;
            }
            else impar++;
            
            System.out.print("Introduza um valor: ");
            num_Intro = sc.nextInt();
        }
        
        System.out.println("Pares: " + par);
        System.out.println("Impares: " + impar);
        if(par > 0) System.out.println("Média: " + (media / quant_Intro));
    }
}