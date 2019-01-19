import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main{

    public static void main(String[] args) throws IOException {


        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("#.00");
        String[] input = bufferedReader.readLine().split(" ");
        final int withdraw = Integer.valueOf(input[0]);
        final double amount = Double.valueOf(input[1]);
        if (withdraw == 0 || amount == 0 || withdraw % 5 != 0 || (withdraw + 0.5) > amount) {
            System.out.println(df.format(amount));
            return;
        }

        System.out.println(df.format(amount - withdraw - 0.5));
    }
}
