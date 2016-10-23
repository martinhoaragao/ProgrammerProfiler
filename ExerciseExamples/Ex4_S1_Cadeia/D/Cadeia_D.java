/*
* S1) Escreva um programa Java que determine quantas vezes uma sub-cadeia de caracteres (fornecida pelo utilizador)
* aparece no interior de uma outra cadeia (também fornecida inicialmente pelo utilizador).
Considere que a cadeia ‘BABABABA’ contém tres subcadeias ‘BAB’ (‘BABABABA’).*/


import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class S1 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Cadeia: ");
        String str = sc.nextLine();
        System.out.print("Subcadeia: ");
        String substr = sc.nextLine();
        System.out.println(StringUtils.countMatches(str, substr));
    }

}
