
/**
 * Escreva um programa Java que determine quantas vezes uma sub-cadeia de caracteres 
 * (fornecida pelo utilizador) aparece no interior de uma outra cadeia 
 * (também fornecida inicialmente pelo utilizador).
 * Considere que a cadeia ’BABABABA’ contém três subcadeias ’BAB’.
 * 
 */
public class Exercicio4 {
    
    public static void exercicio4(String s1, String s2){
        int conta = 0;
        for(int i= 0; i < s1.length(); i++){
            if( s1.substring(i).startsWith(s2)) conta++;
        } 
        
        System.out.println("Contem :" + conta + " vezes a string!");
        
    }
}
