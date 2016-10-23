import java.util.*;
import java.io.*;

public class EX4
{
    public static void main(){
        String s,s2;
        int tamanho,contaO=0,index=0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escreva uma string");
        s = scan.nextLine();
        System.out.println("Escreva a sub-cadeia de carateres");
        s2 = scan.nextLine();
        tamanho = s2.length(); 
        if(tamanho <= s.length()){
            while(tamanho <= s.length()){
                if(s.substring(index,tamanho).equals(s2)){
                    contaO++;
                }
                tamanho++;
                index++;
            }
        }
        System.out.println("A sub-cadeia de carateres ocorre "+contaO +" vezes.");
    }
}
