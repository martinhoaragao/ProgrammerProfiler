import java.util.Scanner;

public class ex1 {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);

     int par = 0, impar = 0, total = 0, conta = 0, numero;

     float media;

     System.out.println("Digite um numero: ");
     while((numero=input.nextInt()) != 0) {
        total += numero;
        conta++;

        if((numero % 2) == 0 ){
        par++;
        }

        else impar++;
        }

     media = total / conta;
     System.out.println("Numeros lidos: "+ conta);
     System.out.println("Numeros pares: "+ par);
     System.out.println("Numeros impares: "+ impar);
     System.out.println("Total: "+ total);
     System.out.println("Media: "+ media);
 }
}