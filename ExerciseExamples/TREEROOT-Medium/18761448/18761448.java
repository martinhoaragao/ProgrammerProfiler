import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());


        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int sum = 0;
            while (N-- > 0) {
                String str[] = br.readLine().split(" ");
                sum += Integer.parseInt(str[0]) - Integer.parseInt(str[1]);
            }
            System.out.println(sum);

        }

    }
}