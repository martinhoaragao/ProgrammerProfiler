import static java.lang.System.out;
import java.util.Scanner;
public class ex2
{
    public static void main(String args[]) {
        int N, M;
        int idade;
        int soma=0;
        int total=0;
        float media=0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o nº de idades que vai ler?");
        N=ler.nextInt();
        System.out.println("Qual o M?");
        M=ler.nextInt();
        while(N>0) {
            System.out.println("Escreva uma idade:");
            idade=ler.nextInt();
            soma+=idade;
            total++;
            N--;
            if(idade>M) System.out.println("A idade "+idade+" é maior que " + M +"!");
        }
        media=(float)soma/total;
        System.out.println("A média das idades lidas é: "+media);
    }
}
