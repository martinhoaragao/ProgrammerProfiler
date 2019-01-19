import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Integer t;
        Scanner scanner = new Scanner(System.in);
        t=scanner.nextInt();
        for (int i = 0; i <t && i <50 ; i++) {
        Integer N,sum=0;
        N = scanner.nextInt();
            int[] id = new int[N],idCsum = new int[N];
        for (int j = 0; j < N && j<30 ; j++) {
            id[j]=scanner.nextInt();
            idCsum[j]=scanner.nextInt();;
            sum +=(id[j]-idCsum[j]);
        }
        System.out.println(sum);
        }
    }
}