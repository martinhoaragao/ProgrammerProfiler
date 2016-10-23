import java.util.*;

public class Exercicio4
{
    public static void main(String [] args) {
        String subcadeia, cadeia;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Introduza a sub-cadeia: ");
        subcadeia = ler.next();
        
        System.out.println("Introduza a cadeia: ");
        cadeia = ler.next();
        
        int conta=0;
        int i=0;
        while( (i = cadeia.indexOf(subcadeia,i)) != -1) {
            i++;
            conta++;
        }
        
        System.out.println("Número de Ocorrências: " + conta);
    }
}
        