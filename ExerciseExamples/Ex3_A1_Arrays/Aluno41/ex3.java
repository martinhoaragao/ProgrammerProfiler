import static java.lang.System.out;
import java.util.Scanner;
public class ex3
{
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        int N, i, x, pares=0;
        System.out.println("Qual o tamanho do vetor?");
        N=ler.nextInt();
        int[] vetor=new int[N];
        for(i=0;i<N;i++) {
            System.out.println("Escreva o próximo valor do array:");
            x=ler.nextInt();
            vetor[i]=x;
        }
        for(int n: vetor) {
            if(n%2==0) pares++;
        }
        System.out.println("O vetor tem "+pares+" números pares.");
    }
}
