import java.util.Scanner;


public class Exercicio1a4
{   
    public static void exercicio2(int M, int N){
        double soma=0;
        int i=0;
        int[] a = new int[N];
        System.out.println("Introduza uma idade");
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        for(int c=1; N>c;c++){
            soma+=n;
            if(n>M) {
                a[i]=n; i++;
            }
            System.out.println("Introduza uma idade");
            n = ler.nextInt();
        }
        
        System.out.println("Idades maiores que" + M);
        for(int c=0; i>c;c++){ 
            System.out.print(a[c] + ", ");
        }
        System.out.println("media: " + soma/N);
    }
}
