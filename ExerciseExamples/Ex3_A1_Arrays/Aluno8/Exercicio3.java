import java.util.Scanner;
import java.util.Vector;

public class Exercicio3
{   
    public Exercicio3(int N)
    {
        if(N>0) {
            Scanner ler = new Scanner(System.in);
            Vector<Integer> v = new Vector<Integer>(N);
            int i,aux;
            System.out.println("Insira os elementos no vector: ");
            for(i=0;i<N;i++) {
                v.add(i,ler.nextInt());
            }
            System.out.print("Valores pares:");
            for(i=0;i<N;i++) {
                aux = v.get(i);
                if(aux%2==0) System.out.print(" " +aux);
            }
            System.out.print("\n");
        }
    }
}
