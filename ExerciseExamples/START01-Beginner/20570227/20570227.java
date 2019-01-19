/* CodeChef
   Number Mirror
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Start01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        int n = Integer.parseInt(text.trim());
        if (n >= 0 && n <= 100000)
            System.out.println(n);
    }
}