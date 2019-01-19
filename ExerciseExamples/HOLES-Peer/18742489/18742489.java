import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class HolesInTheText {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        Integer p =Integer.parseInt(br.readLine());
        for(int j=0; j<p;j++) {
            String str = br.readLine();

            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if ((str.charAt(i) == 'A') || (str.charAt(i) == 'D') || (str.charAt(i) == 'O') || (str.charAt(i) == 'P') || (str.charAt(i) == 'Q') || (str.charAt(i) == 'R')) {
                    count = count + 1;
                } else if (str.charAt(i) == 'B') {
                    count = count + 2;
                }
            }
            out.println(count);
        }
        out.flush();
    }

}
