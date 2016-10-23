package Exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        int i = 0, acc = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Insira uma cadeia de caracteres: ");
        String texto = s.next(); //lê até encontrar espaço
        System.out.println("Insira uma sub-cadeia de caracteres: ");
        String subTexto = s.next(); //lê até encontrar espaço
        s.close();
        
        for(i = 0; i < texto.length(); i++){
            if (texto.startsWith(subTexto, i)) acc++;
        }
        
        System.out.println("A sub-cadeia [" + subTexto + "] aparece " + acc + 
                " vezes na cadeia [" + texto + "]");
    }
}
