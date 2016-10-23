

import java.lang.System.*;
import java.util.Scanner;

public class Exe4
{
    public static int main (){

        String cadeia, subcadeia;
        int numero, i,j, tamcad, tamsub;
        char[] cad, subcad;

        numero = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("insere a cadeia");
        cadeia = scanner.nextLine();

        System.out.println("insere a subcadeia");
        subcadeia = scanner.nextLine();

        tamcad = cadeia.length();
        tamsub = subcadeia.length();

        cad = cadeia.toCharArray();
        subcad = subcadeia.toCharArray();

        for(i=0, j=0; i<tamcad; i++){
            
            if(j== tamsub-1){
                j=0;
                numero++;
            }
            
            if(cad[i] == subcad[j]){
                j++;
            }

        }

        System.out.println("numero = " + numero);

        return 0;


    }
}