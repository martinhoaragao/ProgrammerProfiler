import java.util.Scanner;

public class Main {
    public static long findMax(long n) {
        if (n > 11)
            return (findMax(n / 2) + findMax(n / 3) + findMax(n / 4));
        else
            return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println(findMax(sc.nextLong()));
        }
    }

}