import java.util.Scanner;
import java.util.ArrayList;
/**
 * Ficha de auto-avaliação (Ficha 8)
 */
public class Exercicios
{
    /**
     * Escreva um programa Java que determine quantas vezes uma sub-cadeia de caracteres (fornecida pelo utilizador) aparece no interior de uma outra cadeia (também fornecida
     * inicialmente pelo utilizador). Considere que a cadeia ’BABABABA’ contém três subcadeias ’BAB’.
     */
    public static int exercicio4(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira uma cadeia:");
        String n = ler.nextLine();
        System.out.println("Insira outra cadeia:");
        String m = ler.nextLine();
        int contador = 0;
        for (int i = 0; i < m.length(); i++)
            for (int j = 0, k = i; j < n.length() && k < m.length(); j++, k++)
                if (m.charAt(k) != n.charAt(j)) break;
                else if (j+1 == n.length()) contador++;
        return contador;
    }
}
