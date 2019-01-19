import java.io.*;
import java.util.*;
import java.math.*;
class BytelandianGoldCoins {
  public static void main(String[] args)throws IOException {
     new BytelandianGoldCoins().go();
  }

  public void go()throws IOException{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    for(int i = 0; i < 10; i++) {
       long n = Long.parseLong(reader.readLine());
       long result = calculate(n);
       System.out.println(result);
    }
  }

  public long calculate(long n)throws IOException {
    if (n < 10) {
      return n; 
    } else {
      return Math.max(n, (calculate(n/2)+ calculate(n/3)+ calculate(n/4)));
    }
  }
}