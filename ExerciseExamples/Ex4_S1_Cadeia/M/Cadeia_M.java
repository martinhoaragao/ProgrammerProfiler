import java.util.Scanner;

import static java.lang.System.out;

public class S1 {

    public static void main(String[] args) {
        out.println("Insira uma cadeia de caracteres:");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        out.println("Insira uma sub-cadeia de caracteres:");
        String subStr = input.nextLine();

        int index = 0, total = 0;

        while((index = str.indexOf(subStr,index)) != -1 ){
            index++;
            total++;
        }

        out.println("Numero de sub-cadeias: " + total);
    }

}
