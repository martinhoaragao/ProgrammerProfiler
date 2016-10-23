import java.util.Scanner;
import java.lang.String;

public class Exercicio4{
    public static void main (String[] args) {
        int i = 0;
        int c = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Escreve a sua cadeia principal:");
        String palavra = input.nextLine();
        System.out.println("Escreve a subcadeia desejada:");
        String subpalavra = input.nextLine();
        
        while((i = palavra.indexOf(subpalavra, i)) != -1) {
            c++;
            i++;
        }
        System.out.println("A subcadeia " + subpalavra + " aparece " + c + " vezes na palavra " + palavra);
    }
}
