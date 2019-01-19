import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class doubleString {
   
   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
      int test = Integer.parseInt(in.readLine());
      for (int i = 0; i < test; i++) {
         int n = Integer.parseInt(in.readLine());
         int ans = doublestr(n);
         out.write(ans+"\n" );
         
      }
      out.flush();
   }

   private static int doublestr(int n) {
      if (n%2==0)
         return n;
      else 
         return n-1;
   }

   
}
