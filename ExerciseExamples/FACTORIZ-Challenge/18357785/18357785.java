import java.math.BigInteger;
import java.util.Scanner;

class FACTORIZ {
    public static void main(String args[]) {
        BigInteger num;
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for(int i=0;i<T;i++) {
            num = input.nextBigInteger();
            System.out.println("1");
            System.out.println(num);
        }
    }
}