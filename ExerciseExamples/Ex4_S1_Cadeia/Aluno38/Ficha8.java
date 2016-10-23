package ficha8;

import java.util.Scanner;

public class Ficha8 {
    
    public static void exercicio4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("String onde se efetua pesquisa: ");
        String string = sc.nextLine();
        System.out.print("String para efetuar pesquisa: ");
        String search = sc.nextLine();
        
        int i = 0, index, count = 0;
        while(i < string.length()) {
            index = string.indexOf(search, i);
            if(index != -1) {
                count++;
                i = index + 1;
            }
            else i++;
        }
        
        if(count != 0) System.out.println("Existem " + count + " ocorrencias de [" + search + "] em [" + string + "].");
        else System.out.println("Não existe qualquer orrencia de [" + search + "] em [" + string + "].");
    }
}