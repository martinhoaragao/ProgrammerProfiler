import java.util.Scanner;
/**
 * 1. Escreva um programa Java que leia uma quantidade não determinada
 * de números inteiros positivos (o número que encerrará
 * a leitura será o zero). Calcule e imprima a quantidade de
 * números pares e ímpares assim como a média (numero real)
 * dos valores pares.
 */
public class Ex1{
    // instance variables - replace the example below with your own
    private static int pares;
    public static int impares;
    public static int totalPares;
    
    public static int getPares(){
        return pares;
    }
    
    public static double getMedia(){
        return (double) totalPares/pares;
    }
    public static void leitura(){
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        while(n!=0){
            
            if(n%2==0){
                pares++;
                totalPares = totalPares + n;
            }else{
                impares++;
            }
            n = ler.nextInt();
        }
    }
}
