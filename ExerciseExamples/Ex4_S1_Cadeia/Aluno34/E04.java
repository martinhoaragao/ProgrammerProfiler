
import java.util.Scanner;
import java.util.Random;

import java.lang.String;

public class E04
{
    public static void main(String args[])
    {   
        String cadeia, subcadeia;
        int counter, i, j;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Cadeia inicial: ");
        cadeia = sc.nextLine();
        
        System.out.print("Subcadeia a encontrar: ");
        subcadeia = sc.nextLine();
        
        sc.close();
        
        i = 0;
        counter = 0;
        
        while( (j = cadeia.indexOf(subcadeia, i)) != -1)
        {
            i = j + 1;
            counter ++;
        }

        System.out.println("Subcadeias encontradas: " + counter);
    }
}