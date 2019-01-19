import java.io.*;
import java.util.*;

class Main {
   public static void main(String[] args) throws IOException{
      BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer sto = new StringTokenizer(buff.readLine());
      String i = sto.nextToken();
      while (!i.equals("42")) {
         System.out.println(i);
         i = new StringTokenizer(buff.readLine()).nextToken();
      }
   }
}