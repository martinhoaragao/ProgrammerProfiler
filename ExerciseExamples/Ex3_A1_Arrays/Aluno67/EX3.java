import java.util.*;
public class EX3
{
   
    private static int lerArrayInt(int N)
    {
        int num;
        int pares = 0;
        int i = 0;
        int arr [] = new int[N];
        Scanner input = new Scanner(System.in);
        
        while(N > 0)
        {
            System.out.println("Insira um número inteiro : ");
            num = input.nextInt();
            
            if(num%2 == 0)
            {
                pares++;
            }
            
            arr[i]=num;
            i++;
            N--;
        }
        
       return pares;
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int N;
        int pares=0;
        
        System.out.println("Insira um número inteiro positivo : ");
        N = input.nextInt();
        
        if(N < 0)
        {
            System.out.println("ERRO - Não inseriu um número inteiro positivo!\n");
        }
        else
        {
            pares = lerArrayInt(N);
             System.out.println("A quantidade de números pares no array é : "+pares+".\n");
        }
    }
}
