import java.util.Scanner;
public class Main
{
    public static void exercicio3 (int n){
        int x, pares = 0;
        int[] array = new int[n];
        Scanner s = new Scanner (System.in);
        for (int i = 0; i < n; i++){
            array[i] = s.nextInt();
            if (array[i] % 2 == 0){
                pares++;
            }
        }
        System.out.println ("Pares: " + pares);
    }

}
