import java.util.Scanner;
 
class BytelandianGoldCoins {
 
    public static void main(String args[]) {
 
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            long n = sc.nextLong();
           System.out.println(findMaxNumber(n));
        }
    }
 
    private static long findMaxNumber(long n) {
 
        long sum = n / 2 + n / 3 + n / 4;
        if (sum > n) {
            return findMaxNumber(n/2)+findMaxNumber(n/3)+findMaxNumber(n/4) ;
        } else {
            return n;
        }
    }
} 