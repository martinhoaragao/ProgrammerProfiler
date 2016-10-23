
import java.util.Scanner;
public class ExIdades_Teste {

        public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n, m, idade;
        int total=0;
        float media;
        do {
            System.out.println("Introduza um numero para comparacao");
            m = ler.nextInt();
        } while (m <=0);
        do {
            System.out.println("Introduza o numero de idades");
            n = ler.nextInt();
        } while (n <= 0);
        for (int i = 0; i < n; i++) {
            
            idade = ler.nextInt();
            if (idade > m) {
                System.out.println(idade);
            }
            total=total+idade;
        }
        media=(float)total/n;
        System.out.println(media);

}

}
