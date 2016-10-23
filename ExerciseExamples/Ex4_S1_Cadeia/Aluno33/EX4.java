
public class EX4
{
    /*Escreva um programa Java que determine quantas vezes uma
    sub-cadeia de caracteres (fornecida pelo utilizador) aparece
    no interior de uma outra cadeia (também fornecida inicialmente
    pelo utilizador).
    Considere que a cadeia ’’BABABABA’’ contém três subcadeias
    ’BAB’. */

    int cadeias(String a,String b){
       int subcadeias=0;
       for(int i=0;i<=a.length()-b.length();i++){
        String temp= a.substring(i,b.length()+i);
        System.out.println(temp);
        if(temp.equals(b)){subcadeias++;}
        
        }
        
        
       return subcadeias;



    }

}
