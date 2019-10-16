import java.util.Scanner;

public class Coin {
    public static int getmax(int x) {
        if(x <= 10) {
            return x;
        } else {
            int est =  getmax(x/2) + getmax(x/3) + getmax(x/4);
            return x < est ? est : x;
        }
    }

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int value = in.nextInt();
            System.out.println(getmax(value));
        }
    }
}
