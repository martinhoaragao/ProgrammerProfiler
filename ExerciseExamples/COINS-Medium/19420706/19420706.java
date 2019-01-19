import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

class Coins {
  public static void main(String[] args) throws IOException {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
//    InputStream inputStream = new FileInputStream("testCases.txt");
//    OutputStream outputStream = new FileOutputStream("out.txt");

    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(inputStream)));
    PrintWriter out = new PrintWriter(outputStream);

//    Code here!
    int num;
    HashMap<Integer, Long> map = new HashMap<>();
    for (int i = 0; i < 12; i++) {
      map.put(i, (long) i);
    }
    while (in.hasNext()) {
      num = in.nextInt();
      solve(num, map);
      out.println(map.get(num));
    }
    out.close();
  }

  private static Long solve(int num, HashMap<Integer, Long> map) {
    if (num == 0) return 0L;
    if (map.containsKey(num)) return map.get(num);
    map.put(num, solve(num/2, map) + solve(num/3, map) + solve(num/4, map));
    return map.get(num);
  }
}
