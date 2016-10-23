
public class Ex4
{
    /**
     * Escreva um programa Java que determine quantas vezes uma
     * sub-cadeia de caracteres (fornecida pelo utilizador) aparece
     * no interior de uma outra cadeia (também fornecida inicialmente
     * pelo utilizador).
     */
    public static void main(String cadeiaP, String cadeiaS){
        int i = 0, j = cadeiaS.length(), total = 0;
        int tamP = cadeiaP.length();
        int tamS = cadeiaS.length();
        while(j < tamP){
            if (cadeiaP.subSequence(i, j).equals(cadeiaS)) total++;
            i++; j++;
        }
        System.out.println("Total: "+total+".");
     }
}

