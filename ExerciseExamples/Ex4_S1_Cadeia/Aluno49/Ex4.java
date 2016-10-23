import java.util.Scanner;
/**
 * Escreva um programa Java que determine quantas vezes uma
 * sub-cadeia de caracteres (fornecida pelo utilizador) aparece
 * no interior de uma outra cadeia (também fornecida inicial-
 * mente pelo utilizador). Considere que a cadeia ’BABABABA’ contém três subcadeias ’BAB’.
 */
public class Ex4
{
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        String cadeia, subcadeia;
        int acc = 0, i, j;
    
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
                acc++;
            }
            j++;
        }
        
        System.out.println("Númerod de ocorrências: " + acc);
    }
}