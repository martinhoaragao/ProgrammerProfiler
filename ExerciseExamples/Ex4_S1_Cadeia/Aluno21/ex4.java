
import java.util.Scanner;
import java.lang.String;

public class ex4
{
  public static void ex4() {
    int i , n = 0;
    Scanner tmp = new Scanner (System.in);
    System.out.println("Escreva a primeira cadeia desejada: ");
    String palavra = tmp.next();
    int tam1 = palavra.length();
    System.out.println("Escreva a segunda cadeia desejada: ");
    String subpalavra = tmp.next();
    int tam = subpalavra.length();
    
    for (i = 0; i< tam1 ; i ++) {
        if (i + tam <= tam1) {
          if (palavra.substring(i,i+tam).equals(subpalavra)) {
            n++;
            }
        } 
        }
    System.out.print("Subcadeias: " + n + "\n");
    }
}
