import java.util.Scanner;

public class Ex1 {

   public static void main(String args[]) {
      int total = 0, nr_impares = 0, nr_pares = 0, a;
      float media;
      Scanner input = new Scanner(System.in);
      do {
         System.out.print("Insira um valor: ");
         a = input.nextInt();
         if(a > 0) {
            if((a % 2) == 0) {
               nr_pares++;
               total += a;
            }else {
               nr_impares++;
               total += a;
            }
         }
      } while (a != 0);

      media = total / (nr_pares + nr_impares);
      System.out.println("Numero de pares: " + nr_pares);
      System.out.println("Numero de impares: " + nr_impares);
      System.out.println("Média: " + media);
   }

}
