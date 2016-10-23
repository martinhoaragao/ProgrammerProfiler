
import java.util.Scanner;
import java.util.Random;

public class E03
{
    public static void main(String args[])
    {   
        int n, counter;
        int lst[];
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Limite de números a ler: ");
        n = sc.nextInt();
        
        sc.close();
        
        lst = new int [n];
        
        Random rg = new Random();
        
        for(int i = 0; i < n; i++)
        {
            lst[i] = rg.nextInt(n-1) + 1;
        }
        
        counter = 0;
        
        for(int i = 0; i < n; i++)
        {
            System.out.print(lst[i] + ": ");
            if( (lst[i] % 2) == 0)
            {
                counter++;
            }
        }
        
        System.out.println("\nNúmeros pares lidos: " + counter);
    }
}