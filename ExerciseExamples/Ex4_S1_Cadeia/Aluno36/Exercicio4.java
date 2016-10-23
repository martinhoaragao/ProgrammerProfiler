
/**
 * Escreva um programa Java que determine quantas vezes uma
 * sub-cadeia de caracteres (fornecida pelo utilizador) aparece
 * no interior de uma outra cadeia (também fornecida inicialmente
 * pelo utilizador).
 * Considere que a cadeia ’BABABABA’ contém três subcadeias ’BAB’.
 */

import java.util.Scanner;

public class Exercicio4{
    String obt;
    String sc;
    int vezes; 
    
    public Exercicio4(){
        obt = new String();
        sc = new String();
    }
    
    public int repetidos(String cadeia, String subCadeia){
        int repetido = 0; 
        int sub = subCadeia.length();
        String sc;
        
        if(!cadeia.contains(subCadeia)) return 0;
        else{
            for(int i = 0; i < (cadeia.length() - (sub - 1)); i++){
                sc = cadeia.substring(i, i + sub);
                System.out.println(sc);
                
                if(subCadeia.compareTo(sc) == 0) repetido++;
            }
            return repetido;
        }
        
    }
    
    
    public void Exercicio(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduzir cadeia: ");
        obt = input.nextLine();
        System.out.println("Introduzir sub-cadeia: ");
        sc = input.nextLine();
        
        vezes = repetidos(obt, sc);
        System.out.println("Número de vezes que a Sub-cadeia " + sc + " aparece na cadeia " + obt + " é " + vezes );
    }
    
    
    
}
