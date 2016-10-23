import java.util.Scanner;
import java.util.Vector;
public class Exercicio3
{
    public Exercicio3 (int N) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira o array:");
        Vector<Integer> n = new Vector<>(N);
        int i=0;
        for (i=0;i<N;i++) {
            n.add(ler.nextInt());
        }
        int x=0;
        for (int s : n) {
             if (s%2==0) x+=1;
        }
        System.out.println(x+" elementos pares.");
    }
}
