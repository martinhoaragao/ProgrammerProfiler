import java.util.Scanner;

public class Main
{
   static Scanner scan = new Scanner(System.in); 
    
   public static void aUm() {
       System.out.println("Introduza o tamanho do vetor (> 0): ");
       int n = scan.nextInt();
       int[] vec = new int[n];
       int i = 0;
       System.out.println("Introduza agora N inteiros:");
       while (i < n) {
           vec[i++] = scan.nextInt();
       }
       int pares = 0;
       for(int j = 0; j < n; j++){
           if (vec[j]%2 == 0 && vec[j] >= vec[n-1]) pares++;
       } 
       System.out.println("Resultado: " + pares);
   }
}
