import java.util.Scanner;

public class Main {

    public static long benefit(long n) {
        if ((long) n / 2 + (long) n / 3 + (long) n / 4 > n) {
            return benefit((long) n / 2) + benefit((long) n / 3) + benefit((long) n / 4);
        } else {
            return n;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputLine;
        // System.out.println((int) 13 / 2);
        while (sc.hasNextLine()) {
            inputLine = sc.nextLine();
            long answer = Long.parseLong(inputLine);
            System.out.println(benefit(answer));
        }
    }
}
