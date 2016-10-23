import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercicio3
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    public static void main(int n)
    {
        List<Integer> vetor = new ArrayList<>(n);
        System.out.println("\nInsira os " + n + " elementos:");
        Scanner s = new Scanner(System.in);
        int pares = 0;
        int in, i;
        for(i=0; i<n; i++)
        {
            in = s.nextInt();
            vetor.add(in);
            if(in%2==0) pares++;
        }
        
        System.out.println("O numero de elementos pares inseridos foi: " + pares);
    }
}
