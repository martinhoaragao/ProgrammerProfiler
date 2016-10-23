import java.util.Scanner;

public class Exercicio2
{
    public static void main(String args[])
    {
        int[] idades;
        int m;
        int sum = 0;
        
        Scanner input = new Scanner(System.in);
       
        System.out.print("Idade base: ");
        m = input.nextInt();
        
        System.out.print("Quantas idades: ");
        idades = new int[input.nextInt()];
        
        System.out.println("Insira as idades: ");
        for(int i = 0; i < idades.length; i++)
        {    
            idades[i] = input.nextInt();
            sum += idades[i];
        }
        
        System.out.println("Idades acima de "+m+":");
        for(int i = 0; i < idades.length; i++)
            if(idades[i] > m) System.out.println(idades[i]);
        
        System.out.println("Media de idades: "+sum/idades.length);
            
        input.close();
    }
}
