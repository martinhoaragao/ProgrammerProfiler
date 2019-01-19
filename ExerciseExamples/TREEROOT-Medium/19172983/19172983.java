

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class TREEROOT {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int suma = 0, sumb = 0;
            while (n-- > 0) {
                String str[] = br.readLine().split(" ");
                suma += Integer.parseInt(str[0]);
                sumb += Integer.parseInt(str[1]);
            }
            out.println(suma - sumb);
        }
        out.flush();
    }
}