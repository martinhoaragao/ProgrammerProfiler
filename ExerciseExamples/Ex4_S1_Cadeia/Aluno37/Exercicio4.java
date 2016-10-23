import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.err;
import static java.lang.System.out;

public class Exercício4{
    public static void main(String argv[]){
        int i, nocorr;
        String cadeia, subCadeia;
        
        if(argv.length != 2){
            err.println("Número inválido de argumentos! Utilização: Exercício2 cadeia sub-cadeia");
            return;
        }
        
        cadeia = argv[0];
        subCadeia = argv[1];
        i = nocorr = 0;
        
        while(i != -1){
            i = cadeia.indexOf(subCadeia, i);
            if(i != -1){
                ++nocorr;
                ++i;
            }
        }
        out.printf("A sub-cadeia '%s' ocorre %d vezes em '%s'.\n", subCadeia, nocorr, cadeia);
    }
}
