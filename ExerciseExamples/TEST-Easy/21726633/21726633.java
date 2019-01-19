import java.io.*;
import java.util.*;

class Main {
   public static void main(String[] args) throws IOException{
      Scanner sc = new Scanner(System.in);

      int i = sc.nextInt();
      while (i != 42) {
         System.out.println(i);
         i = sc.nextInt();
      }
   }
}