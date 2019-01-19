import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SimpleSolution {

  public static void main(String[] args) throws IOException {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    int tests = Integer.parseInt(r.readLine().trim());
    for (int i=0; i<tests; ++i) {
      doTest(r);
    }
    r.close();
  }

  private static void doTest(BufferedReader r) throws IOException {
    int idSum = 0;
    int childSums = 0;
    int nodes = Integer.parseInt(r.readLine().trim());
    for (int i=0; i<nodes; ++i) {
      String[] parts = r.readLine().trim().split("\\s+");
      int id = Integer.parseInt(parts[0].trim());
      int childSum = Integer.parseInt(parts[1].trim());
      idSum += id;
      childSums += childSum;
    }
    System.out.println(idSum - childSums);
  }
  
}
