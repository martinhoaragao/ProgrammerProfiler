import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercicio2{
    public static void main (String[] args, int M, int N) {
        int soma = 0;
        List<Integer> idades = new ArrayList<Integer>();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira as N idades que pretende ler:");
        
        for(int i = 0 ; i < N; i++) {
            
            int a = input.nextInt();
            
            if(a > M)
                idades.add(a);
                
            soma += a;
            
        }
        
        System.out.println("As idades lidas superiores a M sao:");
        
        for(Integer i : idades) {
            System.out.println(i);
        }
        
        float media = (soma) / (N);
        
        System.out.println("A media das idades lidas e: " + media);
    }
}