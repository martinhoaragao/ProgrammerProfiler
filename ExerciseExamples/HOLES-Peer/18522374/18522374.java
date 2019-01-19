import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class HOLES {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        System.in));


        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            String s = br.readLine();
            int holes = 0;
            for(int i = 0; i < s.length(); ++i) {
                if(s.charAt(i) == 'A' || s.charAt(i) == 'D' || s.charAt(i) == 'O' ||
                        s.charAt(i) == 'P' || s.charAt(i) == 'Q' || s.charAt(i) == 'R') {
                    holes++;
                }
                else if(s.charAt(i) == 'B') {
                    holes +=2;
                }
            }
            System.out.println(holes);
        }
    }
}
