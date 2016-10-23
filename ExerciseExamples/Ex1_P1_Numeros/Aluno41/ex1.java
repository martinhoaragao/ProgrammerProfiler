import static java.lang.System.out;
import java.util.Scanner;
public class ex1
{
    public static void main(String args[]){
        Scanner ler= new Scanner(System.in);
        int x;
        int total=0;
        int soma=0;
        int pares=0;
        int impares=0;
        int fim=0;
        float media=0;
        while(fim==0) {
            System.out.println("Digite o próximo numero:");
            x=ler.nextInt();
            if(x==0) {
                fim=1;
                media=(float)soma/total;
            }
            else {
                soma+=x;
                total++;
                if(x%2==0)pares++;
                else impares++;
            }
        }
        System.out.println(pares+ "dos números eram pares, " + impares + " dos números eram impares e a média é " + media +"!"); 
    }
}
