import java.util.Scanner;

class HelloWorld {

    private static int exchange(int coin)
    {
        int halfCoin = coin / 2;
        int thirdCoin = coin / 3;
        int fourthCoin = coin / 4;

        if (coin >= halfCoin + thirdCoin + fourthCoin)
        {
            return coin;
        } else {
            int sum = exchange(halfCoin) + exchange(thirdCoin) + exchange(fourthCoin);
            return coin < sum ? sum : coin;
        }
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int coin = in.nextInt();
            System.out.println(exchange(coin));
        }
    }
}