import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Prince
 */
class RootProblem2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(reader.readLine());
        for (int i = 0; i < testCases; i++) {
            int n = Integer.parseInt(reader.readLine());
            int id = 0, sums = 0;
            for (int j = 0; j < n; j++) {
                StringTokenizer stringTokens = new StringTokenizer(reader.readLine());
                id += Integer.parseInt(stringTokens.nextToken());
                sums += Integer.parseInt(stringTokens.nextToken());
            }
            System.out.println(Math.abs(id - sums));
        }
    }
}
