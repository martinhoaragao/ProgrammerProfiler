
/**
 * Escreva um programa Java que determine quantas vezes uma
 * sub-cadeia de caracteres (fornecida pelo utilizador) aparece
 * no interior de uma outra cadeia (também fornecida inicial-
 * mente pelo utilizador).
 * Considere que a cadeia ’BABABABA’ contém três subcadeias
 * ’BAB’.
 */


import java.util.*;
public class Ex4{
    
   public static int main(String M, String N){
    char primeiro;
    int compM=M.length();
    int compN=N.length();
    primeiro= M.charAt(0);
    if(!N.contains(M))return 0;
    int count=0;
    int t=N.indexOf(primeiro);
    while(t!=-1){
        if (N.substring(t,t+compM).equals(M))count++;
        M=N.substring(t+1,compN);
        t=N.indexOf(primeiro);
    }
     
    
    return count;
   }
   
 
}
