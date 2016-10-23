import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2
{
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        List<Integer> idadesM = new ArrayList<Integer>();
        int M, N, counter, somaidades, nidades, idadelida, i;
        double media;
        
        somaidades = 0;
        nidades = 0;
        M = -1;
        N = -1;
        counter = 0;
        
        while(M < 0)
        {
           System.out.println("Insira o número M: ");
           M = s.nextInt(); 
        }
        
        while(N < 0)
        {
            System.out.println("Insira o número N: ");
            N = s.nextInt();
        }
        
        while(counter < N)
        {
            System.out.println("Insira a idade: ");
            idadelida = s.nextInt();
            
            if(idadelida > M)
                idadesM.add(idadelida);
                
            somaidades += idadelida;
            nidades++;
            counter++;
        }
        
        media = somaidades/nidades;
        
        System.out.println("Idades maiores do que " + M + ":");
        for(i = 0; i < idadesM.size(); i++)
            System.out.println(idadesM.get(i));
            
        System.out.println("Média de todas as idades: " + media);
    }
}
