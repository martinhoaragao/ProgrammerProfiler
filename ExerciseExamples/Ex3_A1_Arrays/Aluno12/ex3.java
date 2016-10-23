import java.util.Scanner;

public class ex3 {
    public static void main(int N, int arr[]){
        int t=0, i=0;
        while (i<N){
            if(arr[i]%2 == 0) t++;
            i++;
        }
        String s ="Existem "+t+" números pares.";
        System.out.println(s);
    }
}
