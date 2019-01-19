import java.io.*;
import java.util.*;

class Main {
   public static void main(String[] args) throws IOException{
      BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
      String i = buff.readLine();
      while (!i.equals("42")) {
         System.out.println(i);
         i = buff.readLine();
      }
   }
}