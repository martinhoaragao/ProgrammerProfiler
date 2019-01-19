import java.util.*;

public class Main {
    final static Double limit = Math.pow(10, 1000000);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int number = in.nextInt();
            if (number == 42) {
                break;
            }
            System.out.println(number);
        }
        in.close();
    }
}