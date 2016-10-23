import java.util.Scanner;

public class Ex1
{   
    public static void main()
    {
        int npares, nimpares, somapares, nlido;
        double media;
        Scanner s = new Scanner(System.in);
        npares = 0;
        nimpares = 0;
        somapares = 0;
        nlido = -1;
        
        System.out.println("Insira um número: ");
        nlido = s.nextInt();
        
        while(nlido != 0)
        {   
            if(nlido%2 == 0) 
            {
                npares++;
                somapares += nlido;
            }
            else nimpares++;
            
            System.out.println("Insira um número: ");
            nlido = s.nextInt();
        }
        
        media = somapares/npares;
        
        System.out.println("Número de pares: " + npares);
        System.out.println("Número de ímpares: " + nimpares);
        System.out.println("Média dos pares: " + media);
    }
}
