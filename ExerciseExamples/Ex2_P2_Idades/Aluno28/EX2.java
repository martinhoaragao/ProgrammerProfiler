import java.util.Scanner;


public class EX2 {
    public static void main(int M, int N) {
        int[] idades = new int[N];
        Scanner read = new Scanner(System.in);
        System.out.println("Insira " + N + " idades");
        for(int i = 0; i < N; i++) {
            idades[i] = read.nextInt();
        }
        System.out.println("Idades maiores que " + M);
        double media = 0;
        for(int i = 0; i < N; i++) {
            media += idades[i];
            if(idades[i] > M) {
                System.out.println(idades[i]);
            }
        }
        media = media / idades.length;
        System.out.println("Média das idades: " + media);
    }
}
