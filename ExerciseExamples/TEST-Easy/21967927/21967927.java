import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author sgewraks
 *
 */
public class Main {

    public static void main(String args[]) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int number = Integer.parseInt(br.readLine());
            if (number != 42) {
                System.out.println(number);
            } else {
                break;
            }
        }
        br.close();
    }

}
