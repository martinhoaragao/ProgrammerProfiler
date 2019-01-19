import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out, true);
    StringTokenizer st;
    
    byte t = Byte.parseByte(br.readLine());
    while(t-->0) {
      byte n = Byte.parseByte(br.readLine());
      int id = 0;
      while(n-->0) {
        st = new StringTokenizer(br.readLine());
        id += Short.parseShort(st.nextToken()) - Short.parseShort(st.nextToken());
      }
      out.println(id);
    }
  }
}