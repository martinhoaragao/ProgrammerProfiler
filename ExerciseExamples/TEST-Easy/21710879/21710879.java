import java.io.*;

public class Main{
   public static void main(String[] args) throws IOException{
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      PrintWriter out = new PrintWriter(System.out);
      
      while(true){
         int x = Integer.parseInt(in.readLine());
         if(x == 42) break;
         out.println(x);
      }
      
      out.close();
   }
}