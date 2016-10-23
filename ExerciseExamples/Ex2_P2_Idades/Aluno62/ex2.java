import java.util.*;

public class ex2 {
    
    public static void main(int N, int M) {
        Scanner input = new Scanner(System.in);
        int[] maioresM = new int[N];
        int leitura, i = 0, j = 0;
        float media = 0;
        System.out.println("Introduza os valores");
        while (i < N) {
            leitura = input.nextInt();
            media += leitura;
            if (leitura > M) maioresM[j++] = leitura;
            i++;
        }
        media = media / i;
        System.out.println(Arrays.toString(maioresM));
        System.out.println("Media: " + media);
    }
}