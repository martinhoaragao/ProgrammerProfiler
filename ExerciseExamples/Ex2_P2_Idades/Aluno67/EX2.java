import java.util.*;
public class EX2
{
    public static void main(String []args)
    {
        int N;
        int M;
        int id=0;
        double media=0.0;
        int n;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira um número inteiro positivo : ");
        N = input.nextInt();
        System.out.println("Insira um número inteiro positivo : ");
        M = input.nextInt();
        
        if(N < 0 || M < 0)
        {
            System.out.println("ERRO  = Não inseriu número positivo. \n");
        }
        else
        {
        n=N; //salvaguarda de valor para a média
        
        while(N > 0)
        {
            System.out.println("Insira uma idade: \n");
            id = input.nextInt();
            media+=id;
            
            if(id > M)
            {
                System.out.println("A idade que inseriu é maior que "+M+".\n");
            }
            N--;
        }
        
        System.out.println("A média das idades é : "+media/n+".\n");
      }
    }
        
}
