import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

 class FACTORIZ {

    static long power(long x, long y) {
        long temp;
        long M = 1000000000000000000l;
        if (y == 0) {
            return 1;
        }
        temp = power(x, y / 2);
        if (y % 2 == 0) {
            return (temp * temp % M);
        } else {
            return (x * temp % M * temp % M);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int test = Integer.parseInt(br.readLine());
        
        
        while (test-- > 0) {
            String str = br.readLine();
            int len=str.length();
             out.append(Integer.toString(1)+"\n");
            out.append(str+"\n");
            
            
           
        }

        out.flush();
    }

}
 