import java.util.Scanner;


public class exercicio2
{
    public static void ex2 (int N, int M) {
        int maiores = 0;
        int soma = 0 ;
        int lidas = 0;
        System.out.print("\nDigite as idades:\n\n");
        Scanner ler = new Scanner(System.in);
        for (int c = 0; c < N ; c++) {
            int i = ler.nextInt();
            if (i > M) {
                lidas ++;
                soma += i;
                maiores ++;
                System.out.print("É maior\n");
            }
            else {
                lidas ++;
                soma += i;
                System.out.print("Não é maior\n");
            }
        }
        
        float media = (float) soma / lidas;
        System.out.print("\nMédia das idades lidas: " + media + "\n");
    }
            
}
