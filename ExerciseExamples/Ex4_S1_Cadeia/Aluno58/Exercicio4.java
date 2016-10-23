
/**
 * Escreva um programa Java que determine quantas vezes uma
 * sub-cadeia de caracteres (fornecida pelo utilizador) aparece
 * no interior de uma outra cadeia (também fornecida inicialmente
 * pelo utilizador).
 * Considere que a cadeia ’BABABABA’ contém três subcadeias
 * ’BAB’.
 */
public class Exercicio4
{
    public static int numerosCaracteres(String n,String sub){
        String novo;
        int i,j=0,count = 0;
        char nv;
        for(i = 0; i < n.length();i++){
            System.out.println(n.charAt(i));
            if(n.charAt(i) == sub.charAt(j)){
                int k=i;
                while(n.charAt(k) == sub.charAt(j)){
                    if(j < sub.length() && k < n.length()){
                        k++;j++;
                        if (j == sub.length()){
                            count++;
                            break;
                        }
                    }
                }
                j=0;
            }
        }
        return count;
    }
}
