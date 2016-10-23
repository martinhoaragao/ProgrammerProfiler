import java.util.Scanner;

public class ex{

    public static void main(String []args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Idade base: ");
        int m = s.nextInt();
        System.out.print("Numero de idades a ler: ");
        int n, n1 = n = s.nextInt();
        int idd, sum, i = sum = 0;
        int[] holder = new int[n];
        while (n > 0) {
            System.out.print("Idade: ");
            idd = s.nextInt();
            if (idd > m) {
                holder[i++] = idd;
            }
            sum += idd;
            n--;
        }
        System.out.println("Idades maiores que " + m + ": ");
        for (n = 0; n < i; n++) {
            System.out.println(holder[n]);
        }

        System.out.println("Média das idades: " + (float)sum / n1);
    }
}