import java.util.Scanner;
/**
 * 4. Escreva um programa Java que determine quantas vezes uma
 * sub-cadeia de caracteres (fornecida pelo utilizador) aparece
 * no interior de uma outra cadeia (também fornecida inicialmente
 * pelo utilizador).
 * Considere que a cadeia ’BABABABA’ contém três subcadeias ’BAB’.
 */
public class Ex4{
    // instance variables - replace the example below with your own
        private static String cadeia = new String();
        private static String cadeia2 = new String();
        
    public static String getCadeia(){
        return cadeia;
    }
    
    public static String getCadeia2(){
        return cadeia2;
    }
    
    public static void leitura(){
        Scanner ler = new Scanner(System.in);
        cadeia = ler.nextLine();
        cadeia2 = ler.nextLine();
    }
    
    public static int contida_C(String cadeia, String cadeia2){
        int i = 0, j = 0, k = 0, count = 0;
        while(i<cadeia.length()-1){
            if((cadeia.charAt(i)) == (cadeia2.charAt(j))){
                k = i;
                while((i<cadeia.length()-1) && (j<cadeia2.length()-1) && (cadeia.charAt(i++)) == (cadeia2.charAt(j++))){
                    if(j==cadeia2.length()-1){
                        count++;
                    }
                }
                i = k+1;
                j = 0;
            }else{
                i++;
                j = 0;
                k = 0;
            }
            
            
        }
        return count;   
    }
}
