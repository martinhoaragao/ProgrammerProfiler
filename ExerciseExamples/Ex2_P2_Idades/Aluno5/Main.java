import java.util.Scanner;
public class Main
{
    
    public static void exercicio2 (int m, int n){
        int x, soma = 0, total = 0;
        Scanner s = new Scanner (System.in);
        for (int i = 0; i < n; i++){
            x = s.nextInt();
            if (x > m){
                System.out.println (x);
                soma += x;
                total++;
            }
        }
        System.out.println ("Média: " + (double) soma/total);
    }
}
