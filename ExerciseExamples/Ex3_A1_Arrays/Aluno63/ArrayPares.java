import java.util.Scanner;
public class ArrayPares
{
    public static void main(int N, int arr[]){
        Scanner in = new Scanner(System.in);
        int numpares = 0;
        int i;
        for (i = 0; i < N; i++){
            if (arr[i] % 2 == 0) numpares++;
        }
        System.out.println("Numeros pares até à posição " + N + ": " + numpares);
    }
}
