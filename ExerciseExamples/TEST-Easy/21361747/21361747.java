import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LifeTheUniverseAndEverything {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            int x = Integer.parseInt(in.readLine());

            if (x == 42) {

                break;
            }

            System.out.println(x);
        }
    }
}
