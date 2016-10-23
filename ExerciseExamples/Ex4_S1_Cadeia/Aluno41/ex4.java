import static java.lang.System.out;
import java.util.Scanner;
public class ex4
{
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        String cadeia;
        String outracadeia;
        int count=0, i, j, k;
        System.out.println("Qual a cadeia que vai procurar?");
        cadeia=ler.next();
        System.out.println("Qual a cadeira em que vai procurar?");
        outracadeia=ler.next();
        int tam1 = cadeia.length();
        int tam2 = outracadeia.length();
        for(i=0;i+tam1-1<tam2;i++) {
            if(outracadeia.substring(i, i+tam1).equals(cadeia)) count++;
        }
        System.out.println("A cadeia "+cadeia+" aparece "+count+" vezes em "+outracadeia+"!");
    }
}