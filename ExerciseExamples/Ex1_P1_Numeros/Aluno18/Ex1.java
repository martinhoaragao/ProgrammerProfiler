
import java.util.Scanner;
public class Ex1
{
  public static void exe1(){
        int pares, impares, somaPares, x;  Scanner scanner = new Scanner(System.in);
        pares = impares = somaPares = 0;
        System.out.println("\nDigite um número. Termine com 0");
        x = scanner.nextInt();
        while(x!=0){
            if( (x%2)==0) {pares++; somaPares += x;} else {impares++;}
            System.out.print("Proximo numero:");  x = scanner.nextInt();
        }
        System.out.println("Escreveu "+pares+" números pares e "+impares+" números impares");
        try {
            System.out.println("A média dos valores pares que escreveu é: "+(somaPares/pares) );
        }
        catch (ArithmeticException e){
            System.out.println("Não é possivel calcular a média");
        }
    }
}
