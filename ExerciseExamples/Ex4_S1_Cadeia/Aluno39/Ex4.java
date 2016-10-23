

import java.io.*;
import java.util.*;
public class Ex4
{
    public void subcadeia () {
        String cadeia,subcadeia;
        int subcadSize,vezes=0,i;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduza a cadeia de caracteres:");
        cadeia=scanner.nextLine();
        System.out.println("Introduza a subcadeia de caracteres:");
        subcadeia=scanner.nextLine();
        subcadSize=subcadeia.length();
        if (subcadSize<=cadeia.length()) {
            for (i=0;subcadSize<=cadeia.length();i++,subcadSize++) {
                if (cadeia.substring(i,subcadSize).equals(subcadeia)) vezes++;
            }
        }
        System.out.println("Existem "+vezes+" "+subcadeia+" em "+cadeia);
    }
}
