
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

 class DoubleStrings {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);


        Integer p = Integer.parseInt(br.readLine());
        for (int j = 0; j < p; j++) {
            Integer str = Integer.parseInt(br.readLine());
        if(str%2==0){
            int ma = str;
            out.println(ma);
        }
        else {
            int ma =str-1;
            out.println(ma);
        }
        }
        out.flush();
    }
}