import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {

  public static void main(String[] args) throws IOException  {
     BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
     String x=in.readLine();
     while(!x.equals("42")) {
       System.out.println(x);
       x=in.readLine();
     }
  }
}