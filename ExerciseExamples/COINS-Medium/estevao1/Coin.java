import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Coin {
    private Map<Integer,Integer> calculus;

    private int getmax(int x) {
        if(x <= 10) {
            return x;
        } else if(Coin.calculus.containsKey(x)) {
            return Coin.calculus.get(x);
        } else {
            int est =  getmax(x/2) + getmax(x/3) + getmax(x/4);
            Coin.calculus.put(x, Math.max(x, est));
            return Coin.calculus.get(x);
        }
    }

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        Coin.calculus = new HashMap<>();

        while(in.hasNextInt()) {
            int value = in.nextInt();
            System.out.println(getmax(value));
        }
    }
}