import java.util.Scanner;

public class Ex1 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        int lido, sum = 0, pares = 0, impares = 0;
        do {
            System.out.println("Insira um numero:");
            lido = input.nextInt();
            if(lido != 0) {
                if(lido % 2 == 0) {
                    sum += lido;
                    pares++;
                }
                else
                    impares++;
            }
        } while(lido != 0);
        System.out.println("Total Ímpares: " + impares + "\nTotal Pares: " + pares + "\nMédia: " + sum/pares);
    }
}
