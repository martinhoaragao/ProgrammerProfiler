import java.util.Scanner;

class Coin1 {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            long n= in.nextLong();
            System.out.println(get_val(n));
        }
    }

    static long get_val(long n){

        if(n<12) {
            return n;
        }
        return Math.max(n, get_val(n/2) + get_val(n/3) + get_val(n/4));
    }
}