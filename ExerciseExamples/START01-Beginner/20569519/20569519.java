/* CodeChef
   Number Mirror
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Start01 {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            if (n >= 0 && n <= 10000)
                System.out.println(n);
    }
}