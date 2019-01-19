import java.util.Scanner;
 
class Coins{
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLong()) {
            long n = input.nextLong();
            System.out.println(maxValue(n));
        }
 
    }
    
    public static long maxValue(long n) {
        long ret = n;
        if(ret < n/2 + n/3 + n/4) { 
            ret = maxValue(n/2) + maxValue(n/3) + maxValue(n/4);
        }
        return ret;
    }
 
} 
