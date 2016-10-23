import java.util.Scanner;

public class Ex4
{
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        String cadeia, subcadeia;
        int counter = 0, i, j;
    
        System.out.println("Insira a cadeia de caracteres inicial:");
        cadeia = s.nextLine();
    
        System.out.println("Insira a sub-cadeia:");
        subcadeia = s.nextLine();
        
        i = 0;
        j = 0;
        while(j < cadeia.length())
        {
            if(cadeia.substring(i, j).contains(subcadeia) == true)
            {
                j--;
                i = j;
                counter++;
            }
            j++;
        }
        
        System.out.println("O número de ocorrência é: " + counter);
    }
}
