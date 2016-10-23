import java.util.Scanner;

public class EX3 {
    public static void main(int N) {
        int[] array = new int[N];
        Scanner read = new Scanner(System.in);
        System.out.println("Insira " + N + " inteiros");
        int numPares = 0;
        for(int i = 0; i < N; i++) {
            array[i] = read.nextInt();
            if(array[i]%2 == 0) {
                numPares++;
            }
        }
        System.out.println("Quantidade de pares: " + numPares);
    }
}
