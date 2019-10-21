import java.util.Scanner;

class Coin {
    public static long getmax(long x) {
        if(x <= 10) {
            return x;
        } else {
            long est =  getmax(x/2) + getmax(x/3) + getmax(x/4);
            return x < est ? est : x;
        }
    }

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextLong()) {
            long value = in.nextLong();
            System.out.println(getmax(value));
        }
    }
}
