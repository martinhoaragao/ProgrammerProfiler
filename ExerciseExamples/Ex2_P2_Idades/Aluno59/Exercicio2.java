import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Exercicio2
{
    public Exercicio2 (int M, int N) {
        Scanner ler = new Scanner(System.in);
        int x=0, aux=0;
        double med=0;
        int[] nrs = new int[N];
        System.out.println("Insira "+N+" numeros:");
        while (x<N) {
            aux=ler.nextInt();
            nrs[x]=aux;
            if (x!=0) med = ((med*x)+aux)/(x+1);
            x++;
        }
        System.out.print("Numeros maiores que "+M+":");
        for (x=0;x<N;x++) {
            if (nrs[x]>M) System.out.print(" "+nrs[x]);
        }
        System.out.println("\nMédia Total:"+med);
    }
}
