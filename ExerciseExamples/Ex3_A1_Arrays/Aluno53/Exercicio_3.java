import java.util.Scanner;
public class Exercicio_3
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(args[0]);
        int[] vetor = new int[n];
        int a,i;
        int pares = 0;
        for(i=0;i<n;i++){
            System.out.print("Numero inteiro: ");
            a = scan.nextInt();
            vetor[i] = a;
        }
        for(i=0;i<n;i++){
            a = vetor[i];
            if((a%2) == 0) pares++;
        }
        System.out.println(pares+" números pares.");
    }
}
