import java.util.Scanner;
class Coins {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        short t = 1;
        while(t++ <= 10) {
            long n = scanner.nextLong();
            long sum = coin(n);
            System.out.println(sum);

        }
    }
    static long coin(long n) {
        long sum = n/2 + n/3 + n/4;
        if(sum > n)
            return coin(n/2) + coin(n/3) + coin(n/4);
        else return n;
    }
}