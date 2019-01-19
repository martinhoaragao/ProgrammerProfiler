import java.util.*;
import java.io.*;

class Life {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        while((t = Integer.parseInt(br.readLine())) != 42) {
          System.out.println(t);
        }
    }
}
