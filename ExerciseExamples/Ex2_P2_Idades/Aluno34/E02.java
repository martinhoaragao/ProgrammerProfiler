import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class E02
{
    public static void main(String args[])
    {
        List<Integer> lst = new ArrayList<Integer>();
        int m, n, num;
        double sum, media;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Limite de idade: ");
        m = sc.nextInt();
        
        System.out.print("Quantidade de números a inserir: ");
        n = sc.nextInt();
        
        sum = 0;
        
        for(int i= 0; i < n; i++)
        {
            System.out.print("Insira número: ");
            num = sc.nextInt();
            
            lst.add(num);
            sum += num;
        }
        
        sc.close();
        
        System.out.print("Idades inseridas maiores que " + m + ": ");
        
        for(Integer g: lst)
        {
            if(g > m)
            {
                System.out.print(g + "; ");
            }
            
        }
        
        System.out.println(sum);
        System.out.println(n);
        
        media = sum / n;
        
        System.out.println("\nMédia de idades inseridas: " + media);
    }
    
}