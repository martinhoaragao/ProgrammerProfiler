import java.util.Scanner;

class ByteLandianCoins {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            long n= in.nextLong();
            System.out.println(computeValue(n));
        }
    }

    private static long computeValue(long n) {
        if(n<12)
            return n;
        return computeValue(n/2) + computeValue(n/3) + computeValue(n/4);
    }
}
