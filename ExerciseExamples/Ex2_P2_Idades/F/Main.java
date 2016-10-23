import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main
{
    static Scanner scan = new Scanner(System.in);
    
    public static void p2() {
        System.out.println("Introduza o M e o N (inteiros positivos)");
        int M = scan.nextInt();
        int N = scan.nextInt();
        System.out.println("Introduza agora a sequência de idades:");
        int num, sum = 0, i = 0, p = 0;
        List idades = new ArrayList();
        while (i < N) {
            num = scan.nextInt();
            if (num > M){
                idades.add(num);
            }
            sum += num;
            i++;
        }
        System.out.println("Idades maiores do que " + M + ":");
        for(int j = 0; j < idades.size(); j++)
            System.out.println("    " + idades.get(j));
        System.out.println("Média das idades: " + (float) sum/N);
    }
}