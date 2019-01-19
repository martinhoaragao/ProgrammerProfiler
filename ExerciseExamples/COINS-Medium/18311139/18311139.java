import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int T = 10;
        long n;
        long ans;
        for (int i = 0; i < T; i++){
            n = scanner.nextLong();
            ans = coins(n);
            System.out.println(ans);
        }

    }

    public static long coins(long n){
        long sum = n / 2 + n / 3 + n / 4;
        if (sum > n){
            return coins(n / 2) + coins(n / 3) + coins(n / 4);
        }
        else {
            return n;
        }
    }
}