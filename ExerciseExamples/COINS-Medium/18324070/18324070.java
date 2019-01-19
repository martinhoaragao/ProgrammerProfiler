import java.util.Scanner;
class Coins {
 
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        byte T = 1;
        while(T++ <= 10) {
            long N = scanner.nextLong();
            System.out.println(getCoin(N));
 
        }
    }
    static long getCoin(long n) {
        long sum = n/2 + n/3 + n/4;
        if(sum > n)
            return getCoin(n/2) + getCoin(n/3) + getCoin(n/4);
        else return n;
    }
}