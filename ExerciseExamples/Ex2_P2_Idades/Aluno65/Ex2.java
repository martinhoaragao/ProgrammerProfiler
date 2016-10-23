import java.util.Scanner;
import java.util.ArrayList;
/**
 * 2. Escreva um programa Java que dado um número M e um nú-
 * mero N, inteiros positivos, lê N idades mostrando todas as idades
 * maiores que M. No final deve mostrar a média (numero real) das
 * idades lidas.
 */
public class Ex2{
    // instance variables - replace the example below with your own
    

    public static ArrayList<Integer> maiorM(ArrayList<Integer> idades){
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        int m = ler.nextInt();
        int j = 0;
        int i = 0;
        ArrayList<Integer> idadesM = new ArrayList<Integer>();
        for(i = 0; i < n; i++){
            if(idades.get(i) > m){
                idadesM.add(idades.get(i));
            }
        }
        return idadesM;
    }
    
    public static double mediaIdades(ArrayList<Integer> idades){
        int total= 0;
        for(Integer x: idades ) total += x;
        return (double) total/idades.size();
    }
    
    public static void print(ArrayList<Integer> idades){
        System.out.println(idades);
    }
}
