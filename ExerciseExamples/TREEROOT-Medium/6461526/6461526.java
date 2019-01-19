import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Created by James on 1/29/2015.
 */

class Driver {
    public static void main(String [] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int T = Integer.parseInt(scanner.readLine().trim());

        for (int t = 0; t < T; ++t) {
            int N = Integer.parseInt(scanner.readLine().trim()), answer = 0;

            for (int i = 0; i < N; ++i) {
                String [] pieces = scanner.readLine().split("\\s+");

                answer += Integer.parseInt(pieces[0]) - Integer.parseInt(pieces[1]); //will always give the root by eliminating child node values
            }

            out.println(answer);
        }

        out.close();
    }
}