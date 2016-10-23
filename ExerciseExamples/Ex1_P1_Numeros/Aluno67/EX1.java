import java.util.*;
public class EX1
{
    
    public static void main(String args[])
    {
        double media=0.0;
        int i,j,n;
        Scanner input = new Scanner(System.in);
        
        n=j=0;
        i=1;
        
        while(true)
        {
            System.out.println("Introduza um numero inteiro positivo: (0 - Sair)");
            i=input.nextInt();
            
            if(i == 0)
            {
                break;
            }
            if(i%2 == 0)
            {
                media+=i;
                j++;
            }
            else
            {
                n++;
            }
        }
        
            System.out.println("Números pares : " + j +".\n");
            System.out.println("Números impares : " +n+".\n");
        
        System.out.println("A média dos números pares é : " + media/j +".\n");
    }
}
