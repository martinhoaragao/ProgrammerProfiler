import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ATM {

    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String line = in.readLine();
        String[] s = line.split(" ");
        int x = Integer.parseInt(s[0]);
        Double y = Double.parseDouble(s[1]);

        if (x % 5 == 0 && x + 0.50 <= y) {

            System.out.println();
            System.out.println(String.format("%.2f", y - x - 0.50));
        } else {

            System.out.println();
            System.out.println(String.format("%.2f", y));
        }
    }
}
