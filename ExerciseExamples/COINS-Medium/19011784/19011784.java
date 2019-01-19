
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
  
  private static Map<Integer, Long> map = new HashMap<>();
  
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String line;
    while ((line = in.readLine()) != null) {
        int num = Integer.parseInt(line);
        System.out.println(countCoinsInDollars(num));
    }
  }

  private static long countCoinsInDollars(int num) {
    if(num < 12) {
      return num;
    } else if(map.containsKey(num)) {
      return map.get(num);
    } else {
      long sum = countCoinsInDollars(num/2) + countCoinsInDollars(num/3) + countCoinsInDollars(num/4);
      map.put(num, sum);
      return sum;
    }
  } 

}
