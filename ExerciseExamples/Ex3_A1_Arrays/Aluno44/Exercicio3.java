import java.util.Scanner;


public class Exercicio3
{
    public static void main(String args[])
    {
        int[] nums;
        int aux;
        int count = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Numero de elementos: ");
        do{
            aux = input.nextInt();
        }while(aux == 0);
        
        nums = new int[aux];
        
        System.out.println("Insira os elementos: ");
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = input.nextInt();
            if((nums[i] % 2) == 0) count++;
        }
        
        System.out.println("Numero de elementos pares: "+count);
        
        input.close();
    }
}
