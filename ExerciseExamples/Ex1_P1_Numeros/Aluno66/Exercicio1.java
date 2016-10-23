
import java.util.Scanner;

public class Exercicio1
{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        int sum = 0, n, counter = 0, even = 0, odd = 0;
        float mean;
        System.out.println("Insira um inteiro: ");
        for(n = ler.nextInt(); n != 0; n = ler.nextInt()){
            if(n % 2 == 0) even++;
            else odd++;
            sum += n;
            counter++;
            System.out.println("Insira um inteiro: ");
        }
        mean = sum/counter;
        System.out.println("Números pares: "+even+"; Número Ímpares: "+odd+"; Média: "+mean+"\n");
    }
}
