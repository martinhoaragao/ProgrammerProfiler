/* package codechef; // don't place package name! */
import java.util.HashMap;
import java.util.Scanner;

class Bank {
    private HashMap<Long, Long> exchanges;

    public Bank() {
        this.exchanges = new HashMap<>();
    }

    private long bestFit(long n) {
        long half = this.exchange(n / 2);
        long third = this.exchange(n / 3);
        long quarter = this.exchange(n / 4);
        long exchangedCurrencies = half + third + quarter;

        return exchangedCurrencies > n ? exchangedCurrencies : n;
    }

    public long exchange(long n) {
        if (n < 11) {
            return n;
        } else if(this.exchanges.containsKey(n)) {
            return this.exchanges.get(n);
        } else {
            long result = this.bestFit(n);
            this.exchanges.put(n, result);

            return result;
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Bank b = new Bank();

        while(in.hasNextLong()) {
            long n = in.nextLong();
            System.out.println(b.exchange(n));
        }
    }
}