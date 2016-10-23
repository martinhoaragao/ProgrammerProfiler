import java.util.Scanner;

public class Exercicio2
{
    private int[] nr;
    private int media;
    
    public Exercicio2(int M, int N) {
        Scanner ler = new Scanner(System.in);
        this.nr = new int[N];
        this.media = 0;
        int x,i;
        System.out.println("Insira " + N + " elementos:");
        for(i=0;i<N;i++) {
            nr[i] = ler.nextInt();
            this.media += nr[i];
        }
        System.out.print("As idades superiores a " + M + " são:");
        for(i=0;i<N;i++) {
            if(nr[i]>M) System.out.print(" "+nr[i]);
        }
        if(this.media!=0) this.media /= N;
        System.out.println("\nMedia de idades: " + this.media);
    }
}
