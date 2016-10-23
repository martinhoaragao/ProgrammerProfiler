
import java.util.Scanner;

public class Exercicio1
{
    public static void main(String args[])
    {
        int evenT = 0;
        int oddT = 0;
        int sumEven = 0;
        int aux;
        Scanner input = new Scanner(System.in);
        
        do
        {
            aux = input.nextInt();
            if((aux % 2) == 0)
            {
                evenT++;
                sumEven += aux;
            }
            else
                oddT++;

        }while(aux != 0);
        
        System.out.println("#pares: "+evenT);
        System.out.println("#impares: "+oddT);
        System.out.println("Media dos pares: "+sumEven/evenT);
        
        input.close();
    }
}
